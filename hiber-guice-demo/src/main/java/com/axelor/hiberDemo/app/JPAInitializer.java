package com.axelor.hiberDemo.app;

import com.google.inject.*;
import com.google.inject.persist.PersistService;

@Singleton
public class JPAInitializer {

	@Inject
    public JPAInitializer(final PersistService service) {
        service.start();
    }
}
