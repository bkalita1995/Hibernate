package com.employee.service;

import javax.persistence.EntityManager;
import javax.servlet.annotation.WebServlet;

import com.employee.entity.Employee;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

public class NewEmployee implements EmployeeService{
	
	@Inject 
	 Provider<EntityManager> em; 
	
	@Transactional
	@Override
	public void employee(int emp_id, String name) {
		
		EntityManager eManager = em.get();
		
		Employee emp = new Employee();
		eManager.persist(emp);
		
	}
	
}
