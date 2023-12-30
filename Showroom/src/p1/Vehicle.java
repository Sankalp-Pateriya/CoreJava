package p1;

import java.io.Serializable;
import java.time.LocalDate;

import e1.Color;

public class Vehicle implements Serializable {
	
	private String chasisNo;
	private Color vehicleClr;
	private int basePrice;
	private LocalDate manufactureDate;
	private String company;
	private boolean available;
	
	public Vehicle(String chasisNo, Color vehicleClr, int basePrice, LocalDate manufactureDate, String company) {
		super();
		this.chasisNo = chasisNo;
		this.vehicleClr = vehicleClr;
		this.basePrice = basePrice;
		this.manufactureDate = manufactureDate;
		this.company = company;
		this.available=true;
	}
	
	public Vehicle(String ch) {
		this.chasisNo=ch;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", vehicleClr=" + vehicleClr + ", basePrice=" + basePrice
				+ ", manufactureDate=" + manufactureDate + ", company=" + company + ", available=" + available + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Vehicle vh=(Vehicle)obj;
		if(this.chasisNo.equals(vh.chasisNo)) {
			return true;
		}
		return false;
	}
	

}
