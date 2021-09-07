package com.brillio.springbootdemo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Student1DAO extends JpaRepository<Student1DTO, String> {

}
