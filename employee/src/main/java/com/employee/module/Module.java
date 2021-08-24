package com.employee.module;

import com.employee.jpaInit.JpaInit;
import com.employee.service.EmployeeService;
import com.employee.service.NewEmployee;
import com.google.inject.servlet.ServletModule;

public class Module extends ServletModule{
	@Override
	protected void configureServlets() {
		bind(JpaInit.class).asEagerSingleton();
		bind(EmployeeService.class).to(NewEmployee.class);
	}

}
