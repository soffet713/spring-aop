package com.springpractice.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* com.springpractice.aop.data.*.*(..))")
    public void dataLayerExecution() {}

    @Pointcut("execution(* com.springpractice.aop.business.*.*(..))")
    public void businessLayerExecution() {}

    @Pointcut("com.springpractice.aop.aspect.CommonJoinPointConfig.businessLayerExecution() && " +
            "com.springpractice.aop.aspect.CommonJoinPointConfig.dataLayerExecution()")
    public void allLayerExecution() {}

    @Pointcut("bean(*dao*)")
    public void beanContainingDao() {}

    @Pointcut("within(com.springpractice.aop.data..*)")
    public void dataLayerExecutionWithWithin() {}

    @Pointcut("@annotation(com.springpractice.aop.aspect.TrackTime)")
    public void trackTimeAnnotation() {}
}
