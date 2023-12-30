package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileIO1 {

	public static void main(String[] args)throws IOException {
		System.out.println("Enter file name:");
		try(Scanner sc=new Scanner(System.in);
				BufferedReader br=new BufferedReader(new FileReader(sc.next()));){
			String line=null;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		}

	}

}
