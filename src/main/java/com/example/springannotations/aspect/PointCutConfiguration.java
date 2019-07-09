package com.example.springannotations.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class PointCutConfiguration {

    @Pointcut("@annotation(com.example.springannotations.annotation.TokenValidator)")
    public void tokenValidator(){}

}
