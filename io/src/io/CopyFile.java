package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyFile {

	public static void main(String[] args)throws IOException {
		System.out.println("Enter Absolute path & name of src & dest:");
		try(Scanner sc=new Scanner(System.in);
				BufferedReader br=new BufferedReader(new FileReader(sc.next()));
				
				PrintWriter pw=new PrintWriter(new FileWriter(sc.next()));){
			String line=null;
			while((line=br.readLine())!=null) {
				pw.println(line);
				System.out.println("Copied Successfully!!");
			}
		}


	}

}
