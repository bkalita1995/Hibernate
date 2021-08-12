package com.m2m;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Students su1 = new Students();
		su1.setName("Biplob Kalita");
		Students su2 = new Students();
		su2.setName("Harish Dev");
		Students su3 = new Students();
		su3.setName("Bikram Kayshap");
		
		
		Laptop lap1 = new Laptop();
		lap1.setLmodel("Lenovo g50");
		Laptop lap2 = new Laptop();
		lap2.setLmodel("hp");
		Laptop lap3 = new Laptop();
		lap3.setLmodel("Acer");
		

		lap1.getSu().add(su1);
		lap1.getSu().add(su2);
		
		lap2.getSu().add(su2);
		lap2.getSu().add(su3);
		lap2.getSu().add(su1);
		
		lap3.getSu().add(su2);
		lap3.getSu().add(su3);
		
		session.save(lap1);
		session.save(lap2);
		session.save(lap3);
		session.save(su1);
		session.save(su2);
		session.save(su3);
		
		
		
		session.getTransaction().commit();
		session.clear();
		

	}

}
