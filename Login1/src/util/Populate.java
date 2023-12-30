package util;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import core.Customer;
import core.ValidationRule;
import enumPlan.ServicePlan;

public class Populate {

	public static List<Customer> populateCustomer() {
		// create empty List
		List<Customer> customers = new ArrayList<>();
		
		
		
		customers.add(new Customer("Sankalp","P","sp","root",1000,LocalDate.parse("2000-10-18"),ServicePlan.SILVER, LocalDate.parse("2023-07-12")));
		customers.add(new Customer("Shubham","R","sr","root",2000,LocalDate.parse("2000-10-18"),ServicePlan.GOLD, LocalDate.parse("2023-02-12")));
		customers.add(new Customer("Chinmay","J","cj","root",5000,LocalDate.parse("2000-10-18"),ServicePlan.DIAMOND, LocalDate.parse("2021-05-12")));
		customers.add(new Customer("Abhay","K","ak@gmail.com","abc",5000,LocalDate.parse("1995-11-12"),ServicePlan.DIAMOND,LocalDate.parse("2021-05-12")));
		customers.add(new Customer("Dhundi","S","ds@gmail.com","abc",10000,LocalDate.parse("1995-11-12"),ServicePlan.PLATINUM,LocalDate.parse("2021-05-12")));

		return customers;
	}

}
