package p2;
import p1.Box;
import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		double w,d,h;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Dimensions:w,d,h");
		w=sc.nextDouble();
		d=sc.nextDouble();
		h=sc.nextDouble();
		Box b1=new Box(w,d,h);
		b1.display();
		System.out.println("For New Box");
		System.out.println("Enter offsets:w,d,h");
		w=sc.nextDouble();
		d=sc.nextDouble();
		h=sc.nextDouble();
		Box b2=new Box();
		b2.newBox(b1,w,d,h);
		b2.display();
		
		sc.close();

	}

}
