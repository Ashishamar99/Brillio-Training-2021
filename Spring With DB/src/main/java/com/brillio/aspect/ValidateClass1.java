package com.brillio.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;


@Aspect //This annotation specifies that this piece of code intercepts cross cuts.
@Order(1) // Weaving - This will be executed Second. After the first aspect ie. ValidateClass which has an order(0)
public class ValidateClass1 {

    @Before("execution(* *.*(Integer, Integer))")
    public void check(JoinPoint jp) throws Exception{
        for (Object x : jp.getArgs()){

            Integer y = (Integer) x;
            if(y>1000){
                throw new IllegalArgumentException("Range Not Supported.");
            }
        }
    }
}
