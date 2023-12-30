package core;

import java.time.LocalDate;

import customEnum.BrandEnum;

public class Pen {
	
	public static int genID=103;
	private int id;
	private BrandEnum brand;
	private String color;
	private String inkclr;
	private int stock;
	private LocalDate stkUpdateDate;
	private LocalDate stkListingDate;
	private double price;
	private double discount;
	
	public Pen( int id,BrandEnum brand, String color, String inkclr, int stock, LocalDate stkUpdateDate,
			LocalDate stkListingDate, double price) {
		super();
		this.id = id;
		this.brand = brand;
		this.color = color;
		this.inkclr = inkclr;
		this.stock = stock;
		this.stkUpdateDate = stkUpdateDate;
		this.stkListingDate = stkListingDate;
		this.price = price;
		this.discount = 20.0;
	}

	public int getId() {
		return id;
	}
	
	

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	

	public LocalDate getStkUpdateDate() {
		return stkUpdateDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pen [id=" + id + ", brand=" + brand + ", color=" + color + ", inkclr=" + inkclr + ", stock=" + stock
				+ ", stkUpdateDate=" + stkUpdateDate + ", stkListingDate=" + stkListingDate + ", price=" + price
				+ ", discount=" + discount + "]";
	}
	
	
	
	
	
	
	

}
