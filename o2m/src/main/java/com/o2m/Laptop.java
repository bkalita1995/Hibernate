package com.o2m;

import javax.persistence.*;



@Entity
@Table(name="laptop_o2m")
public class Laptop {
	@Id
	@Column(name="l_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="l_id")
	@SequenceGenerator(name="l_id",initialValue=500, allocationSize=4,sequenceName="l_sequence")
	private int l_id;
	
	@Column(name="l_model")
	private String l_model;
	
	@ManyToOne
	private Students su;

// Student Obj get_set	
	public Students getSu() {
		return su;
	}

	public void setSu(Students su) {
		this.su = su;
	}

	//laptop id get_set	
	public int getL_id() {
		return l_id;
	}

	public void setL_id(int l_id) {
		this.l_id = l_id;
	}

//laptop model get_set
	public String getL_model() {
		return l_model;
	}

	public void setL_model(String l_model) {
		this.l_model = l_model;
	}

	@Override
	public String toString() {
		return "Laptop [l_id=" + l_id + ", l_model=" + l_model + "]";
	}

	
	
	
}
