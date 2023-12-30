package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import static core.ValidationRule.validateAll;

import core.Customer;
import customException.CustomerException;
import enumPlan.ServicePlan;
import static core.ValidationRule.validateDup;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<String, Customer> hm = new HashMap<>();
			hm=PopulateMap.populate();
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("1. Sign Up\n" + "2. Sign In\n"+"3. Change Password\n"+"4. Sort\n" + "5. Display\n"+"0. Exit\n" + "Enter Choice:");
					switch (sc.nextInt()) {

					case 0:
						exit = true;
						break;

					case 1:
						System.out.println("Enter Customer details:fname lname email pass amt dob plan");
						Customer cust = validateAll(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),
								sc.next(), sc.next(), hm);
						Customer.idGenerator++;
						hm.putIfAbsent(cust.getEmail(), cust);
						break;

					case 2:
						int n = 2;
						System.out.println("Enter email:");
						cust = hm.get(sc.next());
						if (cust != null) {
							System.out.println("Enter pass:");
							while (n > 0) {
								n--;
								if (cust.getPass().equals(sc.next())) {
									System.out.println("Logged In Successfully!!");
									break;
								} else {
									System.out.println("Wrong Password !! " + n + " chances left.");
								}

							}

						} else
							throw new CustomerException("Email not exist!!");

						break;

					case 3:
						n = 2;
						System.out.println("Enter email:");
						cust = hm.get(sc.next());
						if (cust != null) {
							System.out.println("Enter pass:");
							while (n > 0) {
								n--;
								if (cust.getPass().equals(sc.next())) {
									System.out.println("Logged In Successfully!!");
									System.out.println("Enter new password:");
									cust.setPass(sc.next());
									System.out.println("Password Changed Successfully!!");

									break;
								} else {
									System.out.println("Wrong Password !! " + n + " chances left.");
								}

							}

						} else
							throw new CustomerException("Email not exist!!");

						break;
						
					case 4:
						Set<Customer> ss=new HashSet<>(hm.values());
						TreeSet<Customer> ts=new TreeSet<>(ss);
						Iterator<Customer> sitr=ts.iterator();
						while (sitr.hasNext())
							System.out.println(sitr.next());
						break;
						
						

					case 5:
						List<Customer> lst = new ArrayList<>(hm.values());
						Iterator<Customer> itr = lst.iterator();
						while (itr.hasNext())
							System.out.println(itr.next());
						break;

					}
				} catch (CustomerException ce) {
					System.out.println(ce);
					sc.nextLine();
				} catch (Exception e) {
					System.out.println(e);
					sc.nextLine();
				}
			}

		}

	}
}
