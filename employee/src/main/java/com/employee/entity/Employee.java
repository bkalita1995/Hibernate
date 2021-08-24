package com.employee.entity;

import javax.persistence.*;

@Entity
@Table(name="EMPLOYEE")
public class Employee {

	@Id
	@Column(name="employee_id")
	private int emp_id;
	private String Name;
	
	
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
}
