package Interface;

import java.util.Scanner;

import ClassFile.Customer;

public interface Stack {
	int STACK_SIZE=2;
	void push(Customer cust,Scanner sc);
	Customer pop();
}
