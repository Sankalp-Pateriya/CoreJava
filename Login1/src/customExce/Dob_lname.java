package customExce;

import java.util.Comparator;

import core.Customer;

public class Dob_lname implements Comparator<Customer> {
	
	@Override
	public int compare(Customer c1,Customer c2) {
		if(c1.getDob().equals(c2.getDob())) {
			return c1.getLname().compareTo(c2.getLname());
		}
		return 0;
	}

}
