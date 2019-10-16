package com.emp;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import com.emp.dao.EmployeeDao;
import com.emp.model.Department;
import com.emp.model.Employee;
import com.emp.model.Salary;
import com.emp.model.Technology;
import com.emp.service.EmployeeService;
import com.emp.serviceImpl.EmployeeServiceImpl;

@RunWith(SpringRunner.class)
public class EmployeeServiceTest {

	@Mock
	EmployeeDao employeeDao;
	
	@InjectMocks
	EmployeeServiceImpl employeeService;
	
	
	@Test
	public void ShouldReturnCheckEmployeeList()
	{
		List<Employee>empList=new ArrayList<Employee>();
		Employee emp = new Employee();
		Salary s=new Salary();
		Department department=new Department();
		department.setDeptName("Computer");
		s.setSalary(4000);
		emp.setId((long)1);
		emp.setSalary(s);
		emp.setDepartment(department);
		Technology tech=new Technology();
		
		empList.add(emp);
		when(employeeDao.findAll()).thenReturn(empList);
		employeeService.getEmployeeList();
		verify(employeeDao).findAll();
	}
	
	@Test
	public void ShouldReturnCheckEmployeeGetById()
	{	
		
		Employee emp = new Employee();
		Salary s=new Salary();
		Department department=new Department();
		department.setDeptName("Computer");
		s.setSalary(4000);
		emp.setId((long)1);
		emp.setSalary(s);
		emp.setDepartment(department);
		Technology tech=new Technology();
		
		Optional<Employee>emp1=Optional.ofNullable(emp);
		when(employeeDao.findById((long)2)).thenReturn(emp1);
		employeeService.getEmployeeById((long)2);
		verify(employeeDao).findById((long)2);
	}
	
	
	
	@Test
	public void ShouldReturnCheckSaveOprationOfEmployee()
	{
		Employee emp = new Employee();
		Salary s=new Salary();
		Department department=new Department();
		department.setDeptName("Computer");
		s.setSalary(4000);
		emp.setId((long)1);
		emp.setSalary(s);
		emp.setDepartment(department);
		Technology tech=new Technology();
		
		emp.setTechnologies(null);
		when(employeeDao.save(emp)).thenReturn(emp);
		employeeService.saveEmployee(emp);
		verify(employeeDao).save(emp);
	}
	
	@Test
	public void ShouldReturnCheckUpdateOprationOfEmployee()
	{	
		Employee emp = new Employee();
		Salary s=new Salary();
		Department department=new Department();
		department.setDeptName("Computer");
		s.setSalary(4000);
		emp.setId((long)1);
		emp.setSalary(s);
		emp.setDepartment(department);
		Technology tech=new Technology();
		
		emp.setTechnologies(null);
		when(employeeDao.save(emp)).thenReturn(emp);
		employeeService.updateEmployee(emp);
		verify(employeeDao).save(emp);
	}
	
	@Test
	public void ShouldReturnCheckDeleteOprationOfEmployee()
	{	
		Employee employee = new Employee();
		Salary s=new Salary();
		Department department=new Department();
		department.setDeptName("Computer");
		s.setSalary(4000);
		employee.setId((long)1);
		employee.setSalary(s);
		employee.setDepartment(department);
		Technology tech=new Technology();
		
		employee.setTechnologies(null);
		doNothing().when(employeeDao).delete(employee);
		employeeService.deleteEmployee(employee);
		verify(employeeDao).delete(employee);
	}
	
	
}
