package com.emp.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModelProperty;

@Table
@Entity
@XmlRootElement
public class Employee implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ApiModelProperty(notes = "Name of the Employee",name="name",value="divya")
	private String name;
	@ApiModelProperty(notes = "Designation of the Employee",name="designation",value="software Engineer")
	private String designation;
	@ApiModelProperty(notes = "Salary of the Employee",name="salary",value="1001")
	
	
	@OneToOne
	private Salary salary;
	
//	@ManyToOne
//	@JoinColumn(name = "Department", nullable = false)
//	private Department department;
//	
//	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "employee")
//	@JoinColumn(name = "technologies", nullable = false)
//	private List<Technology> technologies;
//	
//	
	
	public Employee() {
	System.out.println("Employee.Employee()");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
		this.salary = salary;
	}


}
