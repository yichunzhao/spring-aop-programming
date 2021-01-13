package com.ynz.demo.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PromotionAspect {

    @Pointcut("@annotation(Promotional)")
    public void selectPromotional() {
    }

    /**
     * Adding an advice after return a value from a jointPoint.
     *
     * @param joinpoint   JointPoint
     * @param returnValue value returned from the JointPoint
     */
    @AfterReturning(value = "selectPromotional()", returning = "returnValue")
    public void afterCalPayment(JoinPoint joinpoint, Object returnValue) {
        StringBuilder msg = new StringBuilder("method called: ");

        msg.append(joinpoint.getSignature().getName());
        msg.append("\n");

        Double discount = null;

        if (returnValue instanceof Double) {
            msg.append(" original price: " + returnValue);
            //promotion: 10% discount
            Double original = (Double) returnValue;
            discount = original * 0.1;
            msg.append(" discount: " + discount);
            msg.append("\n");
        }

        System.out.println(msg);
    }

}
