package core;

import java.util.ArrayList;
import java.util.ListIterator;

public class iterator1 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,80,90,100};
		ArrayList<Integer> intlist=new ArrayList<>(); 
		for(int i:arr) {
			intlist.add(i);
		}
		ListIterator<Integer> intitr=intlist.listIterator();
		while(intitr.hasNext()) {
			int i=intitr.next();
			System.out.println(i);
			intitr.remove();
			System.out.println(intlist);
		}
		

	}

}
