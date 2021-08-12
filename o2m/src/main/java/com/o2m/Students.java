package com.o2m;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Student_o2m")

public class Students {
	@Id
	@Column(name="roll_no")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="s_id")
	@SequenceGenerator(name="s_id",initialValue=100, allocationSize=1,sequenceName="s_sequence")
	private int roll_no;
	
	@Column(name="name")
	private String name;
	
	
	
	@OneToMany(mappedBy="su")
	private List<Laptop>laptop = new ArrayList<>();
	
// Laptop List get_set
	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}


// Roll No get_set
		public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	
//First Name get_set	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
