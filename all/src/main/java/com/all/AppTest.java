package com.all;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppTest {

	public static void main(String[] args) {
		
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("rel_per");
		EntityManager emanager = emFactory.createEntityManager();
		emanager.getTransaction().begin();		


		
//Create Entity Address
		Address add = new Address();
		add.setAddress("BTM LayOut");
											

//Storing Address
		emanager.persist(add);		
		
// Create book Entity
		Books book1 = new Books();
		book1.setBname("Java");
		
		Books book2 = new Books();
		book2.setBname("SQL");
		
// Storing Book Entity		
		emanager.persist(book1);
		emanager.persist(book2);

// Create Book Set		
		Set<Books>  bookSet1 = new HashSet();
			bookSet1.add(book1);
			bookSet1.add(book2);
			
			
		Set<Books> bookSet2 = new HashSet();
			bookSet2.add(book2);
			bookSet2.add(book1);
			
			
			
// Create Laptop Entity
		Laptop lap1 = new Laptop();
		lap1.setLmodel("Dell 500");
					
// Storing Laptop Entity
		emanager.persist(lap1);

// Create Contact Entity		
		ContactNo contno1 = new ContactNo();
		contno1.setNo(11111);
					
		ContactNo contno2 = new ContactNo();
		contno2.setNo(22222);
					
		ContactNo contno3 = new ContactNo();
		contno3.setNo(33333);
		
// Storing Contact Entity		
		emanager.persist(contno1);
		emanager.persist(contno2);
		emanager.persist(contno3);

// Create Student Entity		
		Student stud1 = new Student();
		stud1.setName("Biplob");
		stud1.setBookSet(bookSet1);
		stud1.setLaptop(lap1);
		stud1.setContno(contno1);
		stud1.setAddress(add);
		
		Student stud2 = new Student();
		stud2.setName("Suresh");
		stud2.setBookSet(bookSet2);
		stud2.setLaptop(lap1);
		stud2.setContno(contno2);
		stud2.setAddress(add);
		
		Student stud3 = new Student();
		stud3.setName("Dipankar");
		stud3.setBookSet(bookSet1);
		stud3.setLaptop(lap1);
		stud3.setContno(contno3);
		stud3.setAddress(add);

// Storing Student Entity		
		emanager.persist(stud1);
		emanager.persist(stud2);
		emanager.persist(stud3);



		emanager.getTransaction().commit();
		emanager.close();
		emFactory.close();
		
	}

}
