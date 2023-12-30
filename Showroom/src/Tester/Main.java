package Tester;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import CustomException.VehicleException;

import static p1.ValidationRule.validateAllInput;
import p1.Vehicle;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Vehicle> vehicles = new ArrayList<>();
			boolean exit = false;
			while (!exit) {
				System.out.println("1. Add Vehicle\n" + "2. Display\n" + "Enter Choice:");
				try {
					switch (sc.nextInt()) {

					case 0:
						exit = true;
						break;

					case 1:
						System.out.println("Enter Vehicle details:ch clr bp md cmpny");
						vehicles.add(
								validateAllInput(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next(), vehicles));
						System.out.println("Vehicle Added");
						break;

					case 2:
						for (Vehicle vh : vehicles) {
							System.out.println(vh.toString());
						}
						break;
						
					case 3:
						ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("Bin.ser"));
						out.writeObject(vehicles);
						System.out.println("Done!!");
						break;
						
					case 4:
						ObjectInputStream in=new ObjectInputStream(new FileInputStream("Bin.ser"));
						System.out.println(in.readObject()); 
						break;
				
					}
				}catch (VehicleException ve)
				{
					System.out.println(ve);
				}
				catch (Exception e) {
					System.out.println(e);
					sc.nextLine();
				}
			}

		}

	}
}
