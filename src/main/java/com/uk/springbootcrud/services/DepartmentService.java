package com.uk.springbootcrud.services;

import com.uk.springbootcrud.dto.DepartmentResponseDTO;
import com.uk.springbootcrud.dto.StudentResponseDTO;
import com.uk.springbootcrud.entity.Department;
import com.uk.springbootcrud.entity.Student;

import java.util.List;

public interface DepartmentService {

    public List<Department> getAllDepartments();
    public DepartmentResponseDTO getDepartmentById(int id);
    public DepartmentResponseDTO addDepartment(Department department);
    public DepartmentResponseDTO updateDepartment(Department department);
    public DepartmentResponseDTO deleteDepartment(int id);
}
