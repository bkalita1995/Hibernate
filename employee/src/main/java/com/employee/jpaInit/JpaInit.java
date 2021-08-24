package com.employee.jpaInit;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.persist.PersistService;

@Singleton
public class JpaInit {
	
	@Inject
	public JpaInit(PersistService service) {
		
		service.start();

}
}