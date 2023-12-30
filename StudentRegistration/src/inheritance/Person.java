package inheritance;

public class Person {
	private String fname;
	private String lname;

	
	public Person(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	public String display() {
		return  fname + " " + lname;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

}
