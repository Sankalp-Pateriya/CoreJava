package p2;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		double res=0,a=20,b=10;
		Scanner sc=new Scanner(System.in);
		Enum_Calc[] arr=Enum_Calc.values();
//		for(Enum_Calc i:arr)
//		System.out.println(i.name()+" "+i.ordinal() +" "+i.getOperation());
		
		boolean exit=false;
		while(!exit) {
			System.out.println("Enter Operation ADD SUB");
			String choice=sc.next().toUpperCase();
			Enum_Calc op=Enum_Calc.valueOf(choice);
			switch(op) {
			case EXIT:
				exit=true;
				break;
			case ADD:
				res=a+b;
				break;
				
			case SUB:
				res=Math.abs(a-b);
				break;
				
			case MUL:
				res=a*b;
				break;
				
			case DIV:
				res=a/b;
				break;
			}
			if(exit!=true)
			System.out.println(res);
		}
		
		sc.close();
	}

}
