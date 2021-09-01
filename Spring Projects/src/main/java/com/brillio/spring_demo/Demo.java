package com.brillio.spring_demo;

import javafx.application.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    // @Autowired //Will create a bean and object will be automatically passed to this.
    static Holiday holiday2;

    public static void main(String[] args) {

        /*        Holiday holiday = new Holiday();
        *         This is tightly coupled. We have to do it in a loosely coupled way in spring.
        * */

        ApplicationContext context = new ClassPathXmlApplicationContext("container.xml");
        Holiday hDay = (Holiday) context.getBean("holiday"); //holiday here is the ID of the bean.
        hDay.display();

        Holiday hDay1 = (Holiday) context.getBean("holiday1");
        hDay1.display();

        //USING A JAVA CONTAINER, We've used 2 annotations @Configuration and @Bean to simulate an XML Container.
        ApplicationContext context1 = new AnnotationConfigApplicationContext(JavaContainer.class);
        holiday2 = context1.getBean(Holiday.class);
        holiday2.display();
    }
}

