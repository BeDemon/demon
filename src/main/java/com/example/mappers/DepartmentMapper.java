package com.example.mappers;

import com.example.entity.Department;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DepartmentMapper {
    public List<Department> GetAllDepartment();
    public void DeleteDepartment(@Param("department_id") Integer department_id);
}
