package com.ynz.demo.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

/**
 * wrapping a method, both before it and after it.
 */
@Component
@Aspect
public class TimeConsumptionAspect {
    /**
     * pointCut selecting jointPoints
     */
    @Pointcut("@annotation(TimeConsumption)")
    public void calcTimeConsumed() {
    }

    /**
     * An advice handles the PointCut.
     *
     * @param proceedingJoinPoint
     * @return
     * @throws Throwable
     */
    @Around("calcTimeConsumed()")
    public Object calMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Instant start = Instant.now();
        Object retVal = proceedingJoinPoint.proceed();
        Instant end = Instant.now();

        StringBuilder msg = new StringBuilder("Method ");
        msg.append(proceedingJoinPoint.getSignature().getName());
        msg.append(" cost: ").append(Duration.between(start, end).toMillis()).append(" ms.");
        System.out.println(msg.toString());

        return (retVal instanceof Long) ? (Long) retVal : null;
    }
}
