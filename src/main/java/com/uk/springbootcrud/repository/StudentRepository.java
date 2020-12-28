package com.uk.springbootcrud.repository;

import com.uk.springbootcrud.entity.Student;
import com.uk.springbootcrud.entity.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    public Student findStudentByRollNo(String rollNo);

    public void deleteStudentByRollNo(String rollNo);

    @Query("select new com.uk.springbootcrud.entity.StudentDetails(s.rollNo, s.name, s.grade, d.name) from Student s, Department d where s.department = d")
    public List<StudentDetails> getStudentsDetails();
}
