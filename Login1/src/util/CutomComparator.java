package util;

import java.util.Comparator;

import core.Customer;

public class CutomComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		
		return o1.getDob().compareTo(o2.getDob());
	}
	
}
