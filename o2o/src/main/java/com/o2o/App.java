package com.o2o;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session= sessionFactory.openSession();
		session.beginTransaction();
		
		Students student1= new Students();		
		student1.setName("Raju Karmakar");
		
		Students student2=  new Students();
		student2.setName("Biplob Kalita");
				
		
		Laptop laptop1 = new Laptop();
		laptop1.setLmodel("Lenovo G50");
		
		Laptop laptop2= new Laptop();
		laptop2.setLmodel("Dell");
		
		laptop1.setSu(student1);
		laptop2.setSu(student2);
		
		session.save(student1);
		session.save(student2);
		session.save(laptop1);
		session.save(laptop2);
		
		session.getTransaction().commit();
		session.clear();
	}

}
