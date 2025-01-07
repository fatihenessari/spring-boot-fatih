package com.example.firstdemo.student;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    @GetMapping
    public List<String> findAllStudents(){
        return List.of(
                "Fatih",
                "Enes"
        );
    }

}
