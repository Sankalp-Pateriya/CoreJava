package ClassFile;

import java.util.Scanner;

import Interface.Stack;;

public class Growable extends ImplementClass {

	private Customer[] array = new Customer[Stack.STACK_SIZE];
	private int top = -1;
	int count = 0;
	
	
	
	@Override
	public void push(Customer cust,Scanner sc) {
		
		if (isFull()) {
			Customer[] new_array = new Customer[Stack.STACK_SIZE * 2];
			for (int i = 0; i < array.length; i++) {
				new_array[i] = array[i];
			}
			array = new_array;

		}
		count++;
		array[++top] = cust;

	}

	@Override
	public Customer pop() {
		if (isEmpty())
			System.out.println("Stack is Empty!!");
		else {
			count--;
			top--;
		}
		return array[top+1];

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
