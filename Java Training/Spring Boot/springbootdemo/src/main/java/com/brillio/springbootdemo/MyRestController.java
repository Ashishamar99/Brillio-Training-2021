package com.brillio.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.util.List;

@RestController
public class MyRestController {

    @Autowired
    StudentDAO studentDAO;
    // AutoWired will create an object and give us that created one.

    @GetMapping("/")
    public String firstMethod(){
        return "Welcome to Spring Boot Application";
    }

    @GetMapping("/displayStudents")
    public List<StudentDTO> getStudents(){

        return studentDAO.findAll();
        //findAll is a method which is automatically created to fetch the data from the database and show it.
        //Basically does all the work of getAllStudents() in jdbc_demo project.
    }
}
