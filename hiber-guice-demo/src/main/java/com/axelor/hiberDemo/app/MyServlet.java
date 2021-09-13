package com.axelor.hiberDemo.app;

import com.axelor.hiberDemo.db.*;
import com.axelor.hiberDemo.service.StudentService;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.google.inject.*;
import java.util.*;
import com.google.inject.Singleton;

@Singleton
@WebServlet("/my")
public class MyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private StudentService studentService;

	@Inject
	public MyServlet(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.err.println("service called");
		super.service(req, resp);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse reponse) throws ServletException, IOException {
		System.err.println("do get called");
		reponse.setContentType("text/html");
		PrintWriter pw = reponse.getWriter();

		studentService.setStudents();
	    List<Student> students = studentService.getStudents();
	 
	    Iterator<Student> itr=students.iterator(); 
	    while(itr.hasNext())  {
			Student s1=itr.next();    
			pw.print("<br><br>Student ID :" + s1.getId( ));
			pw.print("<br>Student Name :" + s1.getName( ));
			
	       Phone p=s1.getPhone();
	       pw.print("<br>phone number :" + p.getNumber());
	       
	       List addresses = s1.getAddress();
		   for (Iterator itr2 = addresses.iterator();    itr2.hasNext();){
               Address addr = (Address) itr2.next(); 
               pw.print("<br>Addresses: " + addr.getStreet() + ", " + addr.getCity() +", " + addr.getState()); 
            }
		   
		   Department d=s1.getDepartment();
		   pw.print("<br>department name :" + d.getName());
		   
		   List subjects = s1.getSubject();
		   for (Iterator itr3 = subjects.iterator();    itr3.hasNext();){
			   Subject sub = (Subject) itr3.next(); 
			   pw.print("<br>Subject: " + sub.getName()); 
            }
	    }
	    pw.close();  

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.err.println("do post called");
	}

}
