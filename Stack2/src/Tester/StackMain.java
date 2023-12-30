package Tester;

import java.util.Scanner;

import ClassFile.Customer;
import ClassFile.FixedStack;
import ClassFile.Growable;
import ClassFile.ImplementClass;

public class StackMain {

	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		ImplementClass stk;
		
		System.out.println("1. Fixed Stack\n" + "2. Growable Stack\n" + "Enter choice:");
		choice=sc.nextInt();
		if(choice==1)
			stk=new FixedStack();
		else
			stk=new Growable();
		boolean exit=false;
		while(!exit) {
			System.out.println("Enter 1. To Push\n" + "2. To Pop\n" + "3. Display\n" + "0. To exit\n" + "Enter Choice:");
			
			switch (sc.nextInt()) {
			case 0: 
				exit=true;
				break;
			
			case 1:
				System.out.println("fixed Enter id name address:");
				Customer cust = new Customer(sc.nextInt(), sc.next(), sc.next());
				stk.push(cust,sc);
				break;
				
			case 2:
				Customer pop=stk.pop();
				System.out.println(pop.toString()+" is popped out!!");
				break;
				
			case 3:
				stk.display();
				break;
			}
		}
		
	}

}
