package com.uk.springbootcrud.controller;

import com.uk.springbootcrud.dto.DepartmentResponseDTO;
import com.uk.springbootcrud.entity.Department;
import com.uk.springbootcrud.services.DepartmentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @ApiOperation(value = "department home page", notes = "tp display home page", response = String.class)
    @GetMapping("/department/home")
    public String getHomePage(){
        return "Welcome to Department Info Application :)";
    }

    @ApiOperation(value = "To get all departments", notes = "to show all departments details", response = List.class)
    @GetMapping("/departments")
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }

    @GetMapping("/departments/{deptId}")
    public DepartmentResponseDTO getDepartmentById(@PathVariable("deptId") int deptId){
        return departmentService.getDepartmentById(deptId);
    }

    @PostMapping("/departments")
    public DepartmentResponseDTO addDepartment(@RequestBody Department department){
        return departmentService.addDepartment(department);
    }

    @PutMapping("/departments")
    public DepartmentResponseDTO updateStudent(@RequestBody Department department){
        return departmentService.updateDepartment(department);
    }

    @DeleteMapping("/departments/{deptId}")
    public DepartmentResponseDTO deleteStudent(@PathVariable("deptId") int deptId){
        return departmentService.deleteDepartment(deptId);
    }
}
