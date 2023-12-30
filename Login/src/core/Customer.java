package core;

import java.time.LocalDate;

import enumPlan.ServicePlan;

public class Customer implements Comparable<Customer> {
	public	static int idGenerator=1;
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String pass;
	private double amt;
	private LocalDate dob;
	private ServicePlan plan ;
	
	public Customer(String fname, String lname, String email, String pass, double amt, LocalDate dob,
			ServicePlan plan) {
		super();
		
		this.id = idGenerator;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pass = pass;
		this.amt = amt;
		this.dob = dob;
		this.plan = plan;
	}
	
	public Customer(String email) {
		this.email=email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", amt=" + amt + ", dob=" + dob + ", plan=" + plan + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Customer cust=(Customer)obj;
		if(this.email.equals(cust.email))
			return true;
		return false;
	}

	public String getEmail() {
		return email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public int compareTo(Customer o) {
		return (this.email.compareTo(o.email));
	
	}
	
	
	
	
	
	
	
}
