package com.example.pranay.service;

import com.example.pranay.entity.Student;
import com.example.pranay.repository.StudentRepository;
import com.sun.org.apache.xml.internal.utils.SystemIDResolver;
import jdk.jfr.internal.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    //Logger logger = LoggerFactory.getLogger(StudentService.class);
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
        return (List<Student>) studentRepository.findAll();
        //return null;
    }
    public Student getStudentById(long l){
        Student s=studentRepository.findById(l).get();
        return s;
    }
    public Student getByName(String s){
        Long su=studentRepository.findByName(s);
        System.out.println(su);
        Student sss=studentRepository.findById(su).get();
        System.out.println(sss);
       return sss;
    }
}