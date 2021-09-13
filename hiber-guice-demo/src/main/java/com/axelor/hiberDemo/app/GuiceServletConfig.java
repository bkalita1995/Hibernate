package com.axelor.hiberDemo.app;

import com.google.inject.Guice;
import com.google.inject.persist.jpa.JpaPersistModule;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.google.inject.servlet.GuiceServletContextListener;

public class GuiceServletConfig extends GuiceServletContextListener {
	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new MyModule() ,new JpaPersistModule("demo"));
	}
	
}
