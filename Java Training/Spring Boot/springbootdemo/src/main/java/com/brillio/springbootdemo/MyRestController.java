package com.brillio.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;

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

    @GetMapping("/student/{id}") // Here ID is a path variable, basically a variable value which is passed in the URL
    public Optional<StudentDTO> getAnyStudent(@PathVariable String id){
        return studentDAO.findById(id);
        //Designs a query for finding by id all by itself.
        //Optional returns a specified object or null if there is no matching record.
    }
}