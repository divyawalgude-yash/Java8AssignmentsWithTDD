package com.emp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.Department;
import com.emp.model.EmployeeNotFoundException;
import com.emp.service.DepartmentService;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

	
	@Autowired
    DepartmentService departmentService;

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public List<Department> getDepartmentList() {
		System.out.println("in get");
		List<Department> deptlist = departmentService.getDepartmentList();
		if (deptlist.isEmpty()) {
			throw new EmployeeNotFoundException("Department Not Found");
		} else
			return deptlist;
	}
	
	@GetMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Department getDepartmentById(@PathVariable("id") long id) {

		Optional<Department> dept = departmentService.getDepartmentById(id);
		if (dept.isPresent()) {
			return dept.get();
		} else
			throw new EmployeeNotFoundException("Department Not Found");

	}
	
	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Department saveDepartment(@RequestBody Department dept) {
		Department saveDept = departmentService.saveDepartment(dept);
		System.out.println("....post...");
		return saveDept;
//		}
	}
	
}
