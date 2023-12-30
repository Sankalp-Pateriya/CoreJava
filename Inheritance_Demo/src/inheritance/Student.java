package inheritance;

public class Student extends Person{
	private int id;
	private String course;
	private int fees;

	public Student() {

	}

	public Student(String fname,String lname,int id, String course, int fees) {
		super(fname,lname);
		this.id = id;
		this.course = course;
		this.fees = fees;

	}
	
	public String display() {
		return super.display()+" "+id+" "+course+" "+fees;
	}

}
