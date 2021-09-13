package com.axelor.hiberDemo.service;

import com.axelor.hiberDemo.db.*;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.persist.Transactional;

import javax.persistence.*;
import java.util.*;


public class StudentServiceImpl implements StudentService {

 @Inject 
 Provider<EntityManager> em;
 
	@Transactional
	@Override
	public void setStudents() {
		EntityManager e = em.get();
		
		Student s1 = new Student("Bhumi p s");
		e.persist(s1);
		Student s2 = new Student("Bhumi Suvagiya");
		e.persist(s2);
		e.flush();

		Phone ph1 = new Phone(9865327845L);
		Phone ph2 = new Phone(8165325895L);

		s1.setPhone(ph1);
		s2.setPhone(ph2);

		Address address1 = new Address();
		address1.setStreet("Bhagavati");
		address1.setCity("Surat");
		address1.setState("Gujarat");

		Address address2 = new Address("sadhna", "Puna", "gujarat");
		Address address3 = new Address("Laxmi", "Rajkot", "gujarat");

		s1.setAddress(address1);
		s1.setAddress(address2);
		s2.setAddress(address3);

		Department d1 = new Department("Computer engineering");
		s1.setDepartment(d1);
		s2.setDepartment(d1);

		Subject sub1 = new Subject("Web development");
		Subject sub2 = new Subject("Java development");

		s1.setSubject(sub1);
		s1.setSubject(sub2);
		s2.setSubject(sub2);
	}
	
	@Transactional
	@Override
	public List<Student> getStudents() {	
		EntityManager e = em.get();
		
		Query q=e.createQuery(" from  Student s"); 
		List<Student> list = (List<Student>)q.getResultList( ); 
		
		return list;		
	}
	

}
