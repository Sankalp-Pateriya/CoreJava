package p2;

public enum Enum_Calc {
	EXIT("EXIT"),ADD("Addition"),SUB("Substraction"),MUL("Multiplication"),DIV("Division");
	
	private String operation;
	
	private Enum_Calc(String op) {
		this.operation=op;
	}
	
	public String getOperation() {
		return operation;
	}
}
