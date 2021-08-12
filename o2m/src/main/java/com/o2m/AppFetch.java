package com.o2m;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppFetch {
	
	public static void main(String[] args) {

			SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			
			Students su = session.get(Students.class, 101);
			
			System.out.println(su.getName());
			
			Collection<Laptop> lap = su.getLaptop();
			
			for (Laptop l : lap) {
				System.out.println(l);
			}
				
				




	}

}
