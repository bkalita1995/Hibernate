package com.m2m;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="student_m2m")
public class Students {
	
	@Id
	@Column(name="roll_no")
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="l_m2m")
	@SequenceGenerator(name="l_m2m",initialValue=100, allocationSize=1)
	private int rollno;
	
	@Column(name="Student_name")
	private String name;
	
	@ManyToMany(mappedBy="su")
	private List<Laptop> laptop = new ArrayList<>();

	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}

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
