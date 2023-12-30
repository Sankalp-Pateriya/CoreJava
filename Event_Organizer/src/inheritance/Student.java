package inheritance;

public class Student extends Person{
	private int gradYear;
	private String enrolledCourse;
	private double fees;
	private int marks;

	
	public Student(String fn, String ln, int year, String enrolledCourse, double fees, int marks)  {
		super(fn, ln);
		System.out.println("in student's  ctor");
		gradYear = year;
		this.enrolledCourse = enrolledCourse;
		this.fees = fees;
		this.marks = marks;

	}
	
	public String display() {
		return "Student : " + super.display() + " passed in " + gradYear + " course : " + enrolledCourse;
	}
	
	public void study() {
		System.out.println(super.getFname()+" is studying "+enrolledCourse);
	}

}
