package com.brillio.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAspect {
    public static void main(String[] args) {
        Arithmetic obj;

        ApplicationContext context = new ClassPathXmlApplicationContext("container1.xml");
        obj = (Arithmetic) context.getBean("arithmetic");

        try{
            System.out.println(obj.add(20, 5));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
