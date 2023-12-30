package p1;

import java.util.Scanner;

public class Tester {

	public enum FoodMenu {
		Dosa, Idli, WadaPav, Exit,Bill

	}

	public static void main(String[] args) {
		int qty, price, amt = 0;

		Scanner sc = new Scanner(System.in);
		FoodMenu ch;
		boolean exit = false;
		while (!exit) {

			try {
				System.out.println("Food Menu");
				System.out.println("Dosa");
				System.out.println("Idli");
				System.out.println("Wada pav");
				System.out.println("Enter Bill For Bill");
				System.out.println("Enter choice:");
				ch = FoodMenu.valueOf(sc.next());

				switch (ch) {
				case Bill:
					exit = true;
					break;

				case Dosa:
					System.out.println("Enter quantity");
					qty = sc.nextInt();
					price = 150;
					amt = qty * price + amt;
					break;

				case Idli:
					System.out.println("Enter quantity");
					qty = sc.nextInt();
					price = 100;
					amt = qty * price + amt;
					break;

				case WadaPav:
					System.out.println("Enter quantity");
					qty = sc.nextInt();
					price = 50;
					amt = qty * price + amt;
					break;
				}

			} catch (IllegalArgumentException e) {
				System.out.println("No such food!!");
			}
		}
		System.out.println("Total amount:" + amt);

		sc.close();
	}

}
