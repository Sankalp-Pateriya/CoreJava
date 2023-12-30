package ClassFile;

import java.util.Scanner;
import Interface.Stack;

public class FixedStack extends ImplementClass {
	int size = Stack.STACK_SIZE;
	Customer[] array = new Customer[size];
	int top = -1;
	int count = 0;
	
	
	
	@Override
	public void push() {
		/*
		 * array[0]=new Customer(202,"df", "fsd"); top++; count++;
		 */
		Scanner sc = new Scanner(System.in);
		if (!isFull()) {
			System.out.println("fixed Enter id name address:");
			count++;
			//System.out.println("before cust");
			Customer cust = new Customer(sc.nextInt(), sc.next(), sc.next());
			//System.out.println("Count increased");
			
			array[++top] =  cust;
			//System.out.println(" after array assignment");
		} else {
			System.out.println("Stack is Full!!");
		}
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
