package com.uk.springbootcrud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDetails {

    private String rollNo;
    private String name;
    private int grade;
    private String deptName;

}
