package com.brillio.spring_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //This will add the XML Documents. (It becomes a container). This is much easier than an XML Container.

public class JavaContainer {

    @Bean
    public Holiday getHoliday() throws Exception{
        return new Holiday("Gandhi Jayanti", "2nd Oct");
    }

}
