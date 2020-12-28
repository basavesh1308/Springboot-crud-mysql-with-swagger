package com.uk.springbootcrud.controller;

import com.uk.springbootcrud.dto.StudentResponseDTO;
import com.uk.springbootcrud.entity.Student;
import com.uk.springbootcrud.entity.StudentDetails;
import com.uk.springbootcrud.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentInfoController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student/home")
    public String getHomePage(){
        return "Welcome to Student Info Application :)";
    }

    @GetMapping("/students")
    public List<Student> getAllStudent(){
       return studentService.getAllStudent();
    }

    @GetMapping("/studentdetails")
    public List<StudentDetails> getAllStudentDetails(){
        return studentService.getAllStudentDetails();
    }

    @GetMapping("/students/{rollNo}")
    public StudentResponseDTO getStudentByRollNo(@PathVariable("rollNo") String rollNo){
        return studentService.getStudentByRollNo(rollNo);
    }

    @PostMapping("/students")
    public StudentResponseDTO addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PutMapping("/students")
    public StudentResponseDTO updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/students/{id}")
    public StudentResponseDTO deleteStudent(@PathVariable("id") int id){
        return studentService.deleteStudent(id);
    }



}
