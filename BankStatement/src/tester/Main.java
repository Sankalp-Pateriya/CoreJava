package tester;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import core.Bank;

public class Main {

	public static void main(String[] args)throws IOException,DateTimeParseException {
		List<Bank> lst=new ArrayList<>();
		String[] headers=null;
		String[] values=null;
		try(Scanner sc=new Scanner(System.in);
				BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\sanka\\Documents\\workspace-sts-3.9.18.RELEASE\\file1.txt"))) {
			String lines=null;
			int count=0;
			while((lines=br.readLine())!=null) {
				if(count==0) {
					headers=lines.split(",");
					count++;
//					for(String s:headers) {
//						System.out.print(s+"\t");
//					}
				}
				else {
					values= lines.split(",");
//					for(String s:values) {
//						System.out.print(s+"\t");
//					}
					DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
						LocalDate dte=LocalDate.parse(values[0],formatter);
						double wa=Double.parseDouble(values[2]);
						double da=Double.parseDouble(values[3]);
								
						Bank b=new Bank(dte,values[1],wa,da);
						lst.add(b);
				}
					
//				System.out.println();
			}
			for(Bank b:lst) {
				System.out.println(b);	
			}
			
		double sumOfDeposit=lst.stream().
			mapToDouble(Bank::getDepositAmount).
			sum();
			
			System.out.println("Sum of DepositAmt="+sumOfDeposit);
			
		}

	}

}
