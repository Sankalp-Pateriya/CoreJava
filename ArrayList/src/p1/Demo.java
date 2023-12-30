package p1;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		ArrayList<Integer> l1=new ArrayList<>();
		int[] data= {10,20,30,40,50};
		for(int i:data) {
			l1.add(i);
		}
		System.out.println(l1);
		
		l1.add(100);
		l1.add(2, 90);
		l1.remove(l1.size()-1);
		l1.set(l1.size()-1, l1.get(0)*7);
			System.out.println(l1);
		
		System.out.println(l1.size());
		

	}

}
