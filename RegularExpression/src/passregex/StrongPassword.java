package passregex;

import java.util.Scanner;
import java.util.regex.Pattern;



public class StrongPassword {

	public static void main(String[] args) {
		System.out.println("enter password containing dgt upperCase lowerCase spl");
		Scanner sc=new Scanner(System.in);
		Check ch=new Check();
		ch.validatePassword(sc.next());
		
	}

}
