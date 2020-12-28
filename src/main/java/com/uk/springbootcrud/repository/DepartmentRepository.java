package com.uk.springbootcrud.repository;

import com.uk.springbootcrud.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    public Department findDepartmentByDeptId(Integer deptId);
}
