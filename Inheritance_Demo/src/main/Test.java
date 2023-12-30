package main;
import inheritance.Student;
import inheritance.Person;
public class Test {

	public static void main(String[] args) {
		Person s=new Student("Sankalp","Pateriya",172,"DAC",100000);
		Person s2=new Person("Sankalp","Pateriya");
		String str=s.display();
		System.out.println(str);
		String str2=s2.display();
		System.out.println(str2);

	}

}
