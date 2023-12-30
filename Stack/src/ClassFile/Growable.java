package ClassFile;

import java.util.Scanner;

import Interface.Stack;;

public class Growable extends ImplementClass {

	private Customer[] array = new Customer[Stack.STACK_SIZE];
	private int top = -1;
	int count = 0;
	
	
	
	@Override
	public void push() {
		Scanner sc = new Scanner(System.in);
		if (isFull()) {
			Customer[] new_array = new Customer[Stack.STACK_SIZE * 2];
			for (int i = 0; i < array.length; i++) {
				new_array[i] = array[i];
			}
			array = new_array;

		}
		System.out.println("growable Enter id name address:");
		count++;
		Customer cust = new Customer(sc.nextInt(), sc.next(), sc.next());
		array[++top] = cust;
//		sc.close();

	}

	@Override
	public void pop() {
		if (isEmpty())
			System.out.println("Stack is Empty!!");
		else {
			System.out.println(array[top] + " is Popped out!!");
			top--;
		}
		count--;

	}

	@Override
	public void display() {
		for (int i = 0; i < count; i++) {

			System.out.println(array[i].toString());
		}
	}

	public boolean isFull() {
		if (top == (array.length - 1))
			return true;
		return false;
	}

	boolean isEmpty() {
		if (top == -1)
			return true;
		return false;
	}

}
