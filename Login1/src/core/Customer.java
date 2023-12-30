package core;

import java.time.LocalDate;

import enumPlan.ServicePlan;

public class Customer implements Comparable<Customer> {
	public	static int idGenerator=0;
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String pass;
	private double amt;
	private LocalDate dob;
	private ServicePlan plan ;
	private LocalDate lastPaymentDate;
	
	public Customer(String fname, String lname, String email, String pass, double amt, LocalDate dob,
			ServicePlan plan,LocalDate lastPayDate) {
		super();
		idGenerator++;
		this.id = idGenerator;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.pass = pass;
		this.amt = amt;
		this.dob = dob;
		this.plan = plan;
		this.lastPaymentDate=lastPayDate;
	}
	
	
	
	
	public LocalDate getDob() {
		return dob;
	}




	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public LocalDate getLastPaymentDate() {
		return lastPaymentDate;
	}


	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}

	public Customer(String email) {
		this.email=email;
	}

	
	
	
	public ServicePlan getPlan() {
		return plan;
	}




	@Override
	public String toString() {
		return "Customer [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", pass=" + pass
				+ ", amt=" + amt + ", dob=" + dob + ", plan=" + plan + ", lastPaymentDate=" + lastPaymentDate + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Customer cust=(Customer)obj;
		if(this.email.equals(cust.email))
			return true;
		return false;
	}

	@Override
	public int compareTo(Customer o) {
		
		return this.email.compareTo(o.email);
	}
	
	
	
	
	
	
}
