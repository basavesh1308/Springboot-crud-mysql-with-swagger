package com.uk.springbootcrud.services;

import com.uk.springbootcrud.AppConstants;
import com.uk.springbootcrud.dto.StudentResponseDTO;
import com.uk.springbootcrud.entity.Student;
import com.uk.springbootcrud.entity.StudentDetails;
import com.uk.springbootcrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepo;

    @Override
    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public StudentResponseDTO getStudentByRollNo(String rollNo) {
        Student student = studentRepo.findStudentByRollNo(rollNo);
        return new StudentResponseDTO(student, AppConstants.SUCCESS, "fetched Student Info By RollNo");
    }

    @Override
    public StudentResponseDTO addStudent(Student student) {
        studentRepo.save(student);
        return new StudentResponseDTO(student, AppConstants.SUCCESS, "Student Info has been added");
    }

    @Override
    public StudentResponseDTO updateStudent(Student student) {
        studentRepo.save(student);
        return new StudentResponseDTO(student, AppConstants.SUCCESS, "Student Info has been updated");
    }

    @Override
    public StudentResponseDTO deleteStudent( int id) {
        studentRepo.deleteById(id);
        return new StudentResponseDTO(null, AppConstants.SUCCESS, "Student Info has been deleted");
    }

    @Override
    public List<StudentDetails> getAllStudentDetails() {
        return studentRepo.getStudentsDetails();
    }
}
