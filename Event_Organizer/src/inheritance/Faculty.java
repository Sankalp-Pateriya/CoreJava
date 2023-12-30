package inheritance;

public class Faculty extends Person{
	private int expInYears;
	private String sme;
	
	
	public Faculty(String fname,String lname,int expInYears, String sme) {
		super(fname,lname);
		this.expInYears = expInYears;
		this.sme = sme;
		
	}
	
	public String display() {
		return "Faculty : "+super.display()+" "+expInYears+" "+sme;
	}
	
	public void teach() {
		System.out.println(super.getFname() + " is teaching " + sme);
	}

}
