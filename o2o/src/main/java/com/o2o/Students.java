package com.o2o;

import javax.persistence.*;

@Entity
@Table(name="Student_o2o")
public class Students {
	
	@Id
	@Column(name="Roll_no")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="s_id")
	@SequenceGenerator(name="s_id", initialValue=100, allocationSize=1, sequenceName="s_sequence")
	private int rollno;
	
	@Column(name="name")
	private String name;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
