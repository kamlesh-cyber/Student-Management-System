package com.example.student_management_system;


//controller class is the place where we r be writing API endpoints

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class StudentController {

    HashMap<Integer, Student> hashMap = new HashMap<>();
    @PostMapping("/registerStudent")
    //RequestBody - when u want object
    public void addStudent(@RequestBody Student student){

        int key = student.getRollNo();

        hashMap.put(key, student);
    }

    @GetMapping("/getStudentInfo")
    //RequestParam - when u want variable
    public Student getStudent(@RequestParam("rollNo")Integer rollNo){

        Student student = hashMap.get(rollNo);

        return student;
    }
}
