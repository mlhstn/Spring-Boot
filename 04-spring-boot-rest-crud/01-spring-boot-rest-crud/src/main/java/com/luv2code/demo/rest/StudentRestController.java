package com.luv2code.demo.rest;

import com.luv2code.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    @PostConstruct
    public void loadData() {

        theStudents = new ArrayList<>();

        theStudents.add(new Student("melih","üstün"));
        theStudents.add(new Student("umut","bozkurt"));
        theStudents.add(new Student("anıl","arslan"));

    }
    @GetMapping("/students")
    public List<Student> getStudents() {

        return theStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        if (studentId >= theStudents.size() || studentId < 0){
            throw new StudentNotFoundException("student in not found - " + studentId);
        }

        return theStudents.get(studentId);
    }







}
