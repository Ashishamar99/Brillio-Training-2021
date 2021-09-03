package com.brillio.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;


@Aspect //This annotation specifies that this piece of code intercepts cross cuts.
@Order(2) // Weaving - This will be executed Second. After the first aspect ie. ValidateClass which has an order(0)
public class ValidateClass2 {

    @AfterReturning("execution(* *.*(Integer, Integer))")
    public void check(JoinPoint jp) throws Exception{
        for (Object x : jp.getArgs()){

            Integer y = (Integer) x;
            if(y>2000){
                throw new IllegalArgumentException("Range greater than 2000 Not Supported.");
            }
            else if (y<0){
                throw new IllegalArgumentException("Negative return values not supported.");
            }
        }
    }
}
