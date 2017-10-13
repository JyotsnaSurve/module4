package com.cg.jpacrud.entities;



import java.io.Serializable;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_tab")
public class Customer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="cust_no")
	private int Id;
	
	@Column(name="cust_name")
	private String name;
	
	private String mob;
	private String email;
	@Column(name="cust_dob")
	private Date dob;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date date) {
		this.dob = date;
	}
	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", name=" + name + ", mob=" + mob
				+ ", email=" + email + ", dob=" + dob + "]";
	}
	

	
	
	
}
