package core;

import java.time.LocalDate;

public class Watch {
	public static int idGen=0;
	 private int id;
	 private String name;
	 private Category category;
	 private Brand brand;
	 private Shape shape;
	 private WatchStyle style;
	 private Material material;
	 private int stock;
	 private LocalDate lstDate;
	 private LocalDate updDate;
	 private double price;
	 private double discount=0.0;
	
	 
	 public Watch(String name, Category category, Brand brand, Shape shape, WatchStyle style, Material material,
			int stock, LocalDate lstDate, LocalDate updDate, double price, double discount) {
		super();
		this.id = ++idGen;
		this.name = name;
		this.category = category;
		this.brand = brand;
		this.shape = shape;
		this.style = style;
		this.material = material;
		this.stock = stock;
		this.lstDate = lstDate;
		this.updDate = updDate;
		this.price = price;
		this.discount = discount;
	}
	 
	 
	 
	 
	public LocalDate getLstDate() {
		return lstDate;
	}




	public void setLstDate(LocalDate lstDate) {
		this.lstDate = lstDate;
	}




	public Watch(int id) {
		super();
		this.id = id;
	}

	


	public double getPrice() {
		return price;
	}




	public void setPrice(double price) {
		this.price = price;
	}




	public double getDiscount() {
		return discount;
	}
	
	



	public void setDiscount(double discount) {
		this.discount = discount;
	}




	public int getStock() {
		return stock;
	}


	public LocalDate getUpdDate() {
		return updDate;
	}


	public void setUpdDate(LocalDate updDate) {
		this.updDate = updDate;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}

	





	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	@Override
	public boolean equals(Object obj) {
		Watch w=(Watch)obj;
		if(this.id==w.id) {
			return true;
		}
		else
			return false;
	}




	@Override
	public String toString() {
		return "Watch [id=" + id + ", name=" + name + ", category=" + category + ", brand=" + brand + ", shape=" + shape
				+ ", style=" + style + ", material=" + material + ", stock=" + stock + ", lstDate=" + lstDate
				+ ", updDate=" + updDate + ", price=" + price + ", discount=" + discount + "]";
	}
	 
	 
	 
	 
	 
	 
}
