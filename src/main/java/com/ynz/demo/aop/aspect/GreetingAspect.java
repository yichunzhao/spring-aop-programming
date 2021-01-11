package com.ynz.demo.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * JoinPoint: declaring the joined interest point, which applied at the BL code.
 * PointCut: selecting a joinPoint,
 * Advice: common concern implementation, ref. to a PointCut.
 * Type of Advice: before, after, afterReturning, afterThrowing, around etc.
 *
 * @Aspect is used together with @Component, thus ComponentScan may pick it up.
 */
@Component
@Aspect
public class GreetingAspect {

    /**
     * declaring a PointCut, before greeting methods
     */
    @Pointcut("@annotation(Stealth)")
    public void stealthGreeting() {
    }

    /**
     * ref. to pointCut, defining advice
     */
    @Before("stealthGreeting()")
    public void modifyGreeting() {
        System.out.println("On the behalf of XXX");
    }

    /**
     * Declaring a PointCut after greeting methods
     */
    @Pointcut("@annotation(CleaningUp)")
    public void cleaningUpAfterGreeting() {
    }

    /**
     * ref. to pointCut, defining advice
     */
    @After("cleaningUpAfterGreeting()")
    public void cleanUp() {
        System.out.println("Whatever we have to give you suggestions.");
    }

}
