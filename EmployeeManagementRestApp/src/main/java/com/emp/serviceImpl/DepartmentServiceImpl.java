package com.emp.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.dao.DepartmentDao;
import com.emp.model.Department;
import com.emp.service.DepartmentService;
@Service
public class DepartmentServiceImpl  implements DepartmentService{

	@Autowired
	DepartmentDao departmentDao;
	
	
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentDao.save(department);
	}

	@Override
	public Optional<Department> getDepartmentById(Long id) {
		// TODO Auto-generated method stub
		return departmentDao.findById(id);
	}

	@Override
	public List<Department> getDepartmentList() {
		// TODO Auto-generated method stub
		return departmentDao.findAll();
	}

	@Override
	public Department updateDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentDao.save(department);
	}

	@Override
	public void deleteDepartment(Department department) {
		// TODO Auto-generated method stub
		departmentDao.delete(department);
	}

	
	
}
