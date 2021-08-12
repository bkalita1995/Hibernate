
package com.all;

import javax.persistence.*;

@Entity
public class Laptop {
	
	@Id
	@Column(name="laptop_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="l_id")
	@SequenceGenerator(name="l_id", initialValue= 200, allocationSize=1 )
	private int lid;
	@Column(name="laptop_model")
	private String lmodel;
	
	
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
