package tester;

import java.time.LocalDate;
import java.util.HashMap;

import core.Customer;
import enumPlan.ServicePlan;

public class PopulateMap {
	public static HashMap<String, Customer> populate(){
		HashMap<String, Customer> hp = new HashMap<>();
		hp.put("sp",new Customer("Sankalp","P","sp@gmail.com","abc",1000,LocalDate.parse("1997-12-03"),ServicePlan.SILVER));
		hp.put("sr",new Customer("Shubham","R","sr@gmail.com","abc",2000,LocalDate.parse("1997-11-12"),ServicePlan.GOLD));
		hp.put("ak",new Customer("Abhay","K","ak@gmail.com","abc",5000,LocalDate.parse("1995-11-12"),ServicePlan.DIAMOND));
		hp.put("cj",new Customer("Chinmay","J","cj@gmail.com","abc",1000,LocalDate.parse("1999-12-03"),ServicePlan.SILVER));
		hp.put("dr",new Customer("Dhundi","S","dr@gmail.com","abc",1000,LocalDate.parse("2000-12-03"),ServicePlan.SILVER));
		hp.put("as",new Customer("Abinav","S","as@gmail.com","abc",1000,LocalDate.parse("2000-12-03"),ServicePlan.SILVER));
		return hp;
	}

}
