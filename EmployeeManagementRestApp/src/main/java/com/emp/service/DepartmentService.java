package com.emp.service;

import java.util.List;
import java.util.Optional;

import com.emp.model.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);
	public Optional<Department> getDepartmentById(Long id);
	public List<Department> getDepartmentList();
	public Department updateDepartment(Department department);
	public void deleteDepartment(Department department);
}
