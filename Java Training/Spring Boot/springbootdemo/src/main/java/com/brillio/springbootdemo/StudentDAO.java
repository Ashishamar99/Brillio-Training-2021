package com.brillio.springbootdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // equivalent to @Component @Bean. Will create an object and store it in the container.
public interface StudentDAO extends JpaRepository<StudentDTO, String> {

    //Here, JpaRepository<StudentDTO, String> "String" specifies the datatype of the primary key.


}
