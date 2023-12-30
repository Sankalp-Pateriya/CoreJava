package p1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Customer[] arr=new Customer[3];
		System.out.println("Enter name id city");
		for(int i=0;i<3;i++) {
			arr[i]=new Customer(sc.next(),sc.nextInt(),sc.next());
		}
		display(arr);
		sc.close();

	}
	
	public static void display(Customer... customers) {
		for(Customer c:customers) {
			System.out.println(c.toString());
		}
	}

}
