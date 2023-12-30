package Tester;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import static core.ValidationRule.validateAll;

import core.*;
import core.ValidationRule;
import customExce.Dob_lname;
import customException.CustomerException;
import enumPlan.ServicePlan;
import util.*;

public class Main {

	public static void main(String[] args) throws CustomerException, IOException {
		try (Scanner sc = new Scanner(System.in);) {

			List<Customer> cl = new ArrayList<>();
			cl = Populate.populateCustomer();
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("1. Sign Up\n" + "2. Sign In\n" + "3. Change Password\n" + "4. Display\n"
							+ "5. Sort by email\n" + "6. Due Payments\n" + "7. Sort by dob&last_name\n"+
							"8. Copy io by ServicePlan sort by dob\n"
							+ "Enter Choice:");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter fname lname email pass amt dob plan lastPaymentDate");
						Customer cust = ValidationRule.validateAll(sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), sc.next(), sc.next(), sc.next(), cl);
						cl.add(cust);
						break;

					case 2:
						System.out.println("Enter Email  Password:");
						String email = sc.next();
						int n = 2;
						while (n > 0) {
							n--;
							String pass = sc.next();
							int index = ValidationRule.validateEmail(email, cl);
							cust = cl.get(index);
							if (cust.getPass().equals(pass))
								System.out.println("Login In Successfully");
							else {
								System.out.println("Wrong Password- " + n + " more attempt");

							}

						}
						break;

					case 3:
						System.out.println("Enter Email & password:");
						email = sc.next();
						String pass = sc.next();
						int index = ValidationRule.validateEmail(email, cl);
						cust = cl.get(index);
						if (cust.getPass().equals(pass)) {
							System.out.println("Enter new Password");
							cust.setPass(sc.next());
							System.out.println("Password changed successfully.");
						} else
							System.out.println("Wrong Password!!");
						break;

					case 4:
						for (Customer c : cl) {
							System.out.println(c);
						}
						break;

					case 5:
						Collections.sort(cl);
						for (Customer c : cl) {
							System.out.println(c);
						}
						break;

					case 6:
						LocalDate cd = LocalDate.now();
						ListIterator<Customer> custitr = cl.listIterator();
						while (custitr.hasNext()) {
							Customer c = custitr.next();
							LocalDate pd = c.getLastPaymentDate();
							Period interval = Period.between(pd, cd);
							long p = interval.toTotalMonths();
							if (p > 3) {
								System.out.println(c.getFname() + " " + c.getLname());
								custitr.remove();
							}

						}
//						for(Customer c:cl) {
//							LocalDate pd = c.getLastPaymentDate();
//							Period interval = Period.between(pd, cd);
//							long p = interval.toTotalMonths();
//							if (p > 3) {
//								System.out.println(c.getFname() + " " + c.getLname());
//								cl.remove(c);
//						}
//						
						break;

					case 7:
						Collections.sort(cl, new Dob_lname());
						for (Customer c : cl) {
							System.out.println(c);
						}

						break;

					case 8:
						System.out.println("Enter Plan:");
						ServicePlan sp = ServicePlan.valueOf(sc.next().toUpperCase());
						System.out.println("Enter dest file:");
						PrintWriter pw = new PrintWriter(new FileWriter(sc.next()));
						cl.stream().filter(l -> l.getPlan().equals(sp)).
						sorted(Comparator.comparing(Customer::getDob))
						.forEach(i -> pw.println(i));
						System.out.println("Copy Done Successfully!!");
						pw.close();

						break;

					}

				} catch (CustomerException ce) {
					System.out.println(ce.getMessage());
				} catch (Exception e) {
					System.out.println(e.getMessage());
					sc.nextLine();
				}

			}

		}

	}
}
