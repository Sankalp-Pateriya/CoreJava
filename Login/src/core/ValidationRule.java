package core;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

import customException.CustomerException;
import enumPlan.ServicePlan;

public class ValidationRule {
	public static void validateDup(String email,HashMap<String,Customer> hm)throws CustomerException {
		if(hm.containsKey(email))
			throw new CustomerException("User already exist");
		System.out.println("User Added");
	}
	
	public static void validateEmail(String email)throws CustomerException {
		if(!(email.matches("(.*)@gmail.com")))
			throw new CustomerException("Not a Valid Email");
		else {
			
		}
	}
	
	public static ServicePlan validatePlan(String plan)throws IllegalArgumentException {
		ServicePlan sp=ServicePlan.valueOf(plan.toUpperCase());
		return sp;
	}
	
	public static void validateAmt(ServicePlan sp,double amt)throws CustomerException {
		if(sp.getService_plan()!=amt)
			throw new CustomerException("RegAmt not match with Plan");
	}
	
	public static Customer validateAll(String fname, String lname, String email,
			String pass, double amt, String dob,String plan,HashMap<String,Customer> hm)throws CustomerException,IllegalArgumentException {
		validateDup(email,hm);
		validateEmail(email);
		ServicePlan sp=validatePlan(plan);
		validateAmt(sp, amt);
		LocalDate d=LocalDate.parse(dob);
		return new Customer(fname,lname,email,pass,amt,d,sp);
	}
}
