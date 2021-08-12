package com.o2m;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App {

	public static void main(String[] args) {

		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session= sessionFactory.openSession();
		session.beginTransaction();
		
		Laptop lap1 = new Laptop();
		lap1.setL_model("Lenovo G50");
		
		Laptop lap2 = new Laptop();
		lap2.setL_model("hp 300");
		
		Students stud = new Students();
		stud.setName("Krishna");
		
		lap1.setSu(stud);
//		lap2.setSu(stud);
		
		session.save(stud);
		session.save(lap1);
//		session.save(lap2);
		
		
		session.getTransaction().commit();
		session.clear();

	}

}
