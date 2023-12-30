package validity;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import core.Brand;
import core.Category;
import core.Material;
import core.Shape;
import core.Watch;
import core.WatchStyle;


public class Validation {
	
	public static LocalDate parseDate(String Date)throws DateTimeParseException {
		return LocalDate.parse(Date);
	}
	
	public static Category parseCategory(String category) {
		return Category.valueOf(category.toUpperCase());
	}
	
	public static Brand parseBrand(String brand) {
		return Brand.valueOf(brand.toUpperCase());
	}
	
	public static Shape parseShape(String shape) {
		return Shape.valueOf(shape.toUpperCase());
	}
	
	public static WatchStyle parseWatchStyle(String style) {
		return WatchStyle.valueOf(style.toUpperCase());
	}
	
	public static Material parseMaterial(String material) {
		return Material.valueOf(material.toUpperCase());
	}
	
	
	
	public static Watch validateAllInputs(String name, String category, String brand, String shape, String style, String material,
			int stock, String lstDate, double price) {
		Category cw=parseCategory(category);
		Brand bw=parseBrand(brand);
		Shape sw=parseShape(shape);
		WatchStyle styw=parseWatchStyle(style);
		Material mw=parseMaterial(material);
		LocalDate lstDte=parseDate(lstDate);
		//LocalDate uptdDte=parseDate(updDate);
		Watch wc=new Watch(name,cw,bw,sw,styw,mw,stock,lstDte,lstDte,price,0.0);
		
		return wc;
	}
}
