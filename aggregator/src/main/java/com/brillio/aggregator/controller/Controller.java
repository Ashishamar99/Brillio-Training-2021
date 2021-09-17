package com.brillio.aggregator.controller;

import com.brillio.aggregator.StudentDTO;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.function.ServerRequest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class Controller {
    List<StudentDTO> student = null;
    String url = "http://localhost:9092/displayStudents";

    @GetMapping("/")
    public List<StudentDTO> getAllStudent(){
        RestTemplate template = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(new MediaType[]{MediaType.APPLICATION_JSON}));
        HttpEntity<StudentDTO[]> entity = new HttpEntity<>(headers);
        ResponseEntity<StudentDTO[]> response = template.exchange(url,
                HttpMethod.GET, entity, StudentDTO[].class);
        student = new ArrayList<>(Arrays.asList(response.getBody()));
        return student;
    }
}
