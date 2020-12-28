package com.uk.springbootcrud.services;

import com.uk.springbootcrud.AppConstants;
import com.uk.springbootcrud.dto.DepartmentResponseDTO;
import com.uk.springbootcrud.entity.Department;
import com.uk.springbootcrud.exception.NoDepartmentDataException;
import com.uk.springbootcrud.repository.DepartmentRepository;
import com.uk.springbootcrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepo;

    @Autowired
    private StudentRepository studentRepo;

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepo.findAll();
    }

    @Override
    public DepartmentResponseDTO getDepartmentById(int id) {
        Department department = departmentRepo.findDepartmentByDeptId(id);
        return new DepartmentResponseDTO(department, AppConstants.SUCCESS, "dept info has been fetched");
    }

    @Override
    public DepartmentResponseDTO addDepartment(Department department) {
        if(department==null || (department!=null && department.getName().isEmpty())){
            throw new NoDepartmentDataException("BAD request : No department data in the request body !!!");
        }
        return new DepartmentResponseDTO(departmentRepo.save(department),
                AppConstants.SUCCESS, "dept info has been added");
    }

    @Override
    public DepartmentResponseDTO updateDepartment(Department department) {
        return new DepartmentResponseDTO(departmentRepo.save(department),
                AppConstants.SUCCESS, "dept info has been added");
    }

    @Override
    public DepartmentResponseDTO deleteDepartment(int deptId) {
        departmentRepo.deleteById(deptId);
        return new DepartmentResponseDTO(null, AppConstants.SUCCESS, "dept info has been deleted");
    }
}
