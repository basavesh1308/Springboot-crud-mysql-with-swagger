package com.uk.springbootcrud.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue
    @Column(name = "student_ID")
    private int studId;
    private String rollNo;
    private String name;
    private int grade;
    private int age;
    private String medium;

    @ManyToOne
    @JoinColumn(name = "deptId")
    @JsonBackReference
    private Department department;

}
