package com.example.springannotations;

import com.example.springannotations.annotation.TokenValidator;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class Aspecto {

    @Around(value = "com.example.springannotations.aspect.PointCutConfiguration.tokenValidator() && args(token,..)")
    public Object aroundController(ProceedingJoinPoint joinPoint, String token) throws Throwable {
        System.out.println("Iniciou");

        System.out.println(joinPoint.getArgs());
        System.out.println(token);
        Object proceed = joinPoint.proceed();

        System.out.println("Terminou");

        return proceed;
    }

}
