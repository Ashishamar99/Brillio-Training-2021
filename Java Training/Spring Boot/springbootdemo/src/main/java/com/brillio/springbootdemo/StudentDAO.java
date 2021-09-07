package com.brillio.springbootdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository // equivalent to @Component @Bean. Will create an object and store it in the container.
public interface StudentDAO extends JpaRepository<StudentDTO, String> {

    //Here, JpaRepository<StudentDTO, String> "String" specifies the datatype of the primary key.

    public Optional<StudentDTO> findByfname(String fname);
    //The function name should be same as defined in the student dto and database. We can use camel case or the normal case.
    //ie. Function name can be findByfname() or findByFname().


}
