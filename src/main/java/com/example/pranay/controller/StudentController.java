package com.example.pranay.controller;

import com.example.pranay.entity.Student;
import com.example.pranay.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudents")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
    @GetMapping("/getStudentById")
    public Student getStudent(@RequestParam long id){
        //Long l=Long.parseLong(id);
        return studentService.getStudentById(id);
    }

    @GetMapping("/findbyname/{name}")
    public Student getByName(@PathVariable String name){
        return studentService.getByName(name);
    }
}
