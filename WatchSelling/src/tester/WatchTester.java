package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import static validity.Validation.validateAllInputs;
import core.Watch;
import static util.Populate.populateAll;

public class WatchTester {

	public static void main(String[] args) {

		List<Watch> wtch_lst = new ArrayList<>();
		wtch_lst=populateAll();
		try (Scanner sc = new Scanner(System.in);) {
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("1. Add new Watch\n" + "2. Update stock of Watch\n"
							+ "3. Set Discount of 10% for all watch 1 year old\n"
							+ "4. Remove Watch never sold once listed in 18 months\n"+
							"5. Display All Watches\n" + "0. Exit\n" + "Enter Choice:");

					switch (sc.nextInt()) {

					case 0:
						exit = true;
						break;
      //Sample testCase-->pqr men casio round casual caramic 90 2023-10-26 20000
					case 1:
						System.out.println("Enter Name Category Brand Shape Style Watch Stock StkListingDate Price ");
						Watch wtch = validateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextInt(), sc.next(), sc.nextDouble());
						wtch_lst.add(wtch);
						System.out.println("Watch Added Successfully!!");
						break;
						
					case 2:
						System.out.println("Enter Watch ID:");
						int id=sc.nextInt();
						Watch w=new Watch(id);
						if(wtch_lst.contains(w)) {
							int index=wtch_lst.indexOf(w);
							wtch=wtch_lst.get(index);
							System.out.println("Enter Final Updated Stock Value:");
							int val=sc.nextInt();
							wtch.setStock(val);
							wtch.setUpdDate(LocalDate.now());
							System.out.println("Updated Successfully!!");
						}
						else
							System.out.println("Watch ID not found!!");
						
						break;
						
					case 3:
						for(Watch w1:wtch_lst) {
							LocalDate before1yr=LocalDate.now();
							if(w1.getLstDate().isBefore(before1yr.minusMonths(12))) {
								w1.setDiscount(10.0);
								w1.setPrice(w1.getPrice()*0.9);
							}
						}
						System.out.println("Price Updated after Discount for Watch 1yr Old!!");
						
						
						break;
						
					case 4:
						Iterator<Watch> itr=wtch_lst.iterator();
						while(itr.hasNext()) {
							w=itr.next();
							LocalDate before1yr=LocalDate.now();
							if(w.getUpdDate().isBefore(before1yr.minusMonths(18))) {
								itr.remove();
								System.out.println("ID:"+w.getId()+" Removed!!");
							}
						}
						
						
						break;
						
					case 5:
						for(Watch wt:wtch_lst) {
							System.out.println(wt);
						}
						break;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}

}
