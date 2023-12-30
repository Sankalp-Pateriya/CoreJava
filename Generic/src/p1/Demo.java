package p1;

public class Demo<T,U> {
	private T name;
	private U id;
	
	public Demo(T name,U id) {
		this.name=name;
		this.id=id;
	}
	@Override
	public String toString() {
		return "Name: "+name+" ID: "+id;
	}
}
