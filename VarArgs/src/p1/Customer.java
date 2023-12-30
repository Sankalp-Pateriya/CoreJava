package p1;

public class Customer {
	private String name;
	private int id;
	private String city;
	
	Customer( String name,int id,String city){
		this.name=name;
		this.id=id;
		this.city=city;
	}
	
	@Override
	public String toString() {
		return "Name: "+name+" ID: "+id+" City: "+city;
	}
}
