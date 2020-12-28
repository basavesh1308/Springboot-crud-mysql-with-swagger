package com.uk.springbootcrud.services;

import com.uk.springbootcrud.dto.StudentResponseDTO;
import com.uk.springbootcrud.entity.Student;
import com.uk.springbootcrud.entity.StudentDetails;

import java.util.List;

public interface StudentService {

    public List<Student> getAllStudent();
    public StudentResponseDTO getStudentByRollNo(String rollNo);
    public StudentResponseDTO addStudent(Student student);
    public StudentResponseDTO updateStudent(Student student);
    public StudentResponseDTO deleteStudent(int id);
    public List<StudentDetails> getAllStudentDetails();
}
