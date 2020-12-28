package com.uk.springbootcrud.dto;

import com.uk.springbootcrud.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponseDTO {

    private Student student;
    private String status;
    private String message;
}
