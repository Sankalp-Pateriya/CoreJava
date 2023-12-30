package inheritance;

public class Person {
	private String fname;
	private String lname;

	Person() {

	}

	public Person(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	public String display() {
		return "Full Name:" + fname + " " + lname;
	}

}
