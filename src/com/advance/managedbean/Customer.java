package com.advance.managedbean;

public class Customer {

	private long id;
	private String firstname;
	private String lastname;
	private double banlance;
	
	public Customer() {
		super();
	}
	
	public Customer(long id, String firstname, String lastname, double banlance) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.banlance = banlance;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getBanlance() {
		return banlance;
	}
	public void setBanlance(double banlance) {
		this.banlance = banlance;
	}
	
}
