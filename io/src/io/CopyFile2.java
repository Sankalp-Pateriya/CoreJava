package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyFile2 {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter Absolute path & name of src & dest:");
		try (Scanner sc = new Scanner(System.in);
				BufferedReader br = new BufferedReader(new FileReader(sc.next()));

				PrintWriter pw = new PrintWriter(new FileWriter(sc.next()));) {
			br.lines().filter(l -> l.length() > 40).mapToInt(l -> l.length()).forEach(l -> pw.println(l));

			System.out.println("Copied Successfully!!");
		}
	}

}
