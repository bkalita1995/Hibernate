package com.o2o;

import javax.persistence.*;

@Entity
@Table(name="laptop_o2o")
public class Laptop {
	
	@Id
	@Column(name="l_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="l_id")
	@SequenceGenerator(name="l_id", initialValue=500, allocationSize=4, sequenceName="l_o2o_sequence")
	private int lid;
	
	@Column(name="L_model")
	private String lmodel;
	
	@OneToOne
	private Students su;

	public Students getSu() {
		return su;
	}

	public void setSu(Students su) {
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
