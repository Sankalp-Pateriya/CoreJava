package p1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Date_prg {
	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyy");
		System.out.println("Enter date");
		try(Scanner sc=new Scanner(System.in)){
			Date dt1=sdf.parse(sc.next());	
			System.out.println(sdf.format(dt1));
		}catch(Exception e) {
			System.out.println("Exception");
		}
		
	}
	
	
}
