package main;

import inheritance.Faculty;
import inheritance.Student;
import inheritance.Person;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int counter = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter maximum members:");
		Person[] members = new Person[sc.nextInt()];
		boolean exit = false;
		while (!exit) {
			System.out.println("1. Student Registration\n" + "2. Faculty Registration\n"
					+ "3. Display info of all members \n" + "4. Display info of a specific member\n"+
					"5. Member functionality" + "0. Exit");
			System.out.println("Enter Choice:");
			switch (sc.nextInt()) {
			case 0:
				exit = true;
				break;

			case 1:
				if (counter <= members.length) {
					System.out
							.println("Enter student details : fn,  " + "ln,  year" + ",enrolledCourse,  fees,  marks");
					members[counter++] = new Student(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextDouble(),
							sc.nextInt());
					System.out.println("student registered....");
				} else
					System.out.println("Seats Full!!!");
				break;

			case 2:
				if (counter <= members.length) {
					System.out.println("Enter faculty details : fn,  " + "ln,  exp in yrs , sme");
					members[counter++] = new Faculty(sc.next(), sc.next(), sc.nextInt(), sc.next());
					System.out.println("faculty registered....");
				} else
					System.out.println("Seats Full!!!");
				break;

			case 3:
				for (Person p : members) {
					if (p != null) {
						System.out.println(p.display());
						System.out.println();
					}
				}
				break;

			case 4:
				System.out.println("Enter seat no to know member.");
				System.out.println("Enter seat:");
				int index = sc.nextInt() - 1;
				Person p = members[index];
				System.out.println(p.display());
				break;
				
			case 5:
				System.out.println("Enter seat:");
				index = sc.nextInt() - 1;
				p = members[index];
				if(p instanceof Student) {
					((Student)p).study();
				}
				else
				{
					((Faculty)p).teach();
				}
				break;
			}
		}

	}

}
