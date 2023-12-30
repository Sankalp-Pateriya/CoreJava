package ClassFile;

import java.util.Scanner;
import Interface.Stack;

public class FixedStack extends ImplementClass {
	int size = Stack.STACK_SIZE;
	Customer[] array = new Customer[size];
	int top = -1;
	int count = 0;
	
	
	
	@Override
	public void push(Customer cust,Scanner sc) {
		
		if (!isFull()) {
			count++;
			array[++top] =  cust;
		} else {
			System.out.println("Stack is Full!!");
		}
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
		if(top==-1)
			System.out.println("No elements!!!");
		else
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
