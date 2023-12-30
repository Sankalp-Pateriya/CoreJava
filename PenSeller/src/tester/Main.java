package tester;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import static validation.Entries.validDups;

import core.Pen;
import customException.PenException;
import validation.Entries;
import validation.Populate;

public class Main {

	public static void main(String[] args) throws PenException {
		HashMap<Integer, Pen> penlst = new HashMap<>();
		penlst = Populate.populateAll();
		try (Scanner sc = new Scanner(System.in);) {
			boolean exit = false;

			while (!exit) {
				try {
					System.out.println("1. Add pen\n" + "2. UpdateStock\n" + "3. Set Discount\n" + "4. Remove Old Pen\n"
							+ "5. Display\n" + "Enter choice:");
					switch (sc.nextInt()) {
					case 0:
						exit = true;
						break;

					case 1:

						System.out.println("Enter brand color inkcolor stock  stkUpdateDate stkListingDate  price \n");
						Pen p = Entries.addPen(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next(),
								sc.nextDouble(), penlst);
						penlst.put(p.getId(), p);
						System.out.println("Pen Added!!");
						break;

					case 2:
						System.out.println("Enter PenId:");
						int key = sc.nextInt();
						validDups(key, penlst);
						System.out.println("Enter quantity to be added:");
						int qty = sc.nextInt();
						p = penlst.get(key);
						p.setStock(p.getStock() + qty);
						System.out.println(p.getId()+ " Stock Updated!!");
						break;

					case 3:
						List<Pen> lst = new ArrayList<>(penlst.values());
						for (Pen p1 : lst) {
							LocalDate crntDte = LocalDate.now();
							LocalDate period = crntDte.minusMonths(3);

							if (p1.getStkUpdateDate().isBefore(period)) {
								p1.setPrice(p1.getPrice() * (0.8));
								System.out.println(p1.getId()+" Updated!!");
							}

						}

						break;

					case 4:
						lst = new ArrayList<>(penlst.values());
						for (Pen p1 : lst) {
							LocalDate crntDte = LocalDate.now();
							LocalDate period = crntDte.minusMonths(9);

							if (p1.getStkUpdateDate().isBefore(period)) {
								penlst.remove(p1.getId());
								System.out.println(p1.getId()+" Removed!!");
							}

						}

						break;

					case 5:
						lst = new ArrayList<>(penlst.values());
						for (Pen p1 : lst) {
							System.out.println(p1);
						}
						break;
					}
				} catch (PenException e) {
					System.out.println(e.getMessage());
					sc.nextLine();
				} catch (Exception e) {
					System.out.println(e.getMessage());
					sc.nextLine();
				}

			}

		}

	}

}
