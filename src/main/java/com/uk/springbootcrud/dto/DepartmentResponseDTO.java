package com.uk.springbootcrud.dto;

import com.uk.springbootcrud.entity.Department;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentResponseDTO {

    private Department department;
    private String status;
    private String message;
}
