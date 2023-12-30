package e1;

public enum Color {
	WHITE(10000), BLACK(9000), GREY(80000), SILVER(7000);

	private int additional_price;

	private Color(int additional_price) {
		this.additional_price = additional_price;
	}

	public int getAdditional_price() {
		return additional_price;
	}

	public void setAdditional_price(int additional_price) {
		this.additional_price = additional_price;
	}
	
	

}
