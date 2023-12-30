package core;

import java.time.LocalDate;
import java.util.List;

import customException.CustomerException;
import enumPlan.ServicePlan;

public class ValidationRule {
	public static void validateDup(String email,List<Customer> customers)throws CustomerException {
		Customer c=new Customer(email);
		if(customers.contains(c))
			throw new CustomerException("User already exist");
		System.out.println("User Added");
	}
	
	public static ServicePlan validatePlan(String plan)throws IllegalArgumentException {
		ServicePlan sp=ServicePlan.valueOf(plan.toUpperCase());
		return sp;
	}
	
	public static void validateAmt(ServicePlan sp,double amt)throws CustomerException {
		if(sp.getService_plan()!=amt)
			throw new CustomerException("RegAmt not match with Plan");
	}
	
	public static int validateEmail(String email,List<Customer> cl)throws CustomerException {
		Customer c=new Customer(email);
		int index=cl.indexOf(c);
		if(index!=-1)
			return index;
		throw new CustomerException("Invalid Email");
	}
	
	public static Customer validateAll( String fname, String lname, String email,
			String pass, double amt, String dob,String plan,String lastPayDate,List<Customer> customers)throws CustomerException,IllegalArgumentException {
		validateDup(email,customers);
		ServicePlan sp=validatePlan(plan);
		validateAmt(sp, amt);
		LocalDate d=LocalDate.parse(dob);
		LocalDate lpd=LocalDate.parse(lastPayDate);
		return new Customer(fname,lname,email,pass,amt,d,sp,lpd);
	}
}
