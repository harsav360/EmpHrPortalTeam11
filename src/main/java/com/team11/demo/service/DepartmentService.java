package com.team11.demo.service;

import java.util.List;

import com.team11.demo.model.Department;

public interface DepartmentService {
	List<Department> getAllDepartments();
	void saveDepartment(Department department);
	Department getDepartmentById(int id);
	void deleteDepartmentById(int id);	
}
