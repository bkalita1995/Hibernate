package com.axelor.hiberDemo.app;

import com.axelor.hiberDemo.service.StudentService;
import com.axelor.hiberDemo.service.StudentServiceImpl;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.google.inject.servlet.ServletModule;

public class MyModule extends ServletModule {
	@Override
	protected void configureServlets() {
		 bind(JPAInitializer.class).asEagerSingleton();

		  serve("/*").with(MyServlet.class);
		  bind(StudentService.class).to(StudentServiceImpl.class);
	}
	
}
