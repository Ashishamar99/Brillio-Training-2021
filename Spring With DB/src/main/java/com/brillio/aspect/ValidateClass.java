package com.brillio.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;


@Aspect //This annotation specifies that this piece of code intercepts cross cuts.
@Order(0) // Weaving - This will be executed First.
public class ValidateClass {

    //execute *.* is the cross cut. @Before is the advice. ie, before going to a func, if it has a signature Integer, Integer execute this.
    //First * - package name
    //Second * - Class name
    //Third * - Method name

    //Whatever argument we pass, it'll go to the join point.
    @Before("execution(* *.*(Integer, Integer))")
    public void check(JoinPoint jp) throws Exception{
        for (Object x : jp.getArgs()){

            Integer y = (Integer) x;
            if(y<0){
                throw new IllegalArgumentException("Negative Values are not supported.");
            }
        }
    }
}
