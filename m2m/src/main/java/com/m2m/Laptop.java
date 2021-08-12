package com.m2m;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name= "laptop_m2m")
public class Laptop {
	
	@Id
	@Column(name="laptop_id")
	@GeneratedValue(strategy= GenerationType.SEQUENCE, generator="l_m2m")
	@SequenceGenerator(name="l_m2m",initialValue=100, allocationSize=1)
	private int lid;
	
	@Column(name="laptop_model")
	private String  lmodel;
	
	@ManyToMany
	private List<Students>su = new ArrayList <>();

	
	public List<Students> getSu() {
		return su;
	}

	public void setSu(List<Students> su) {
		this.su = su;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLmodel() {
		return lmodel;
	}

	public void setLmodel(String lmodel) {
		this.lmodel = lmodel;
	}
	
}
