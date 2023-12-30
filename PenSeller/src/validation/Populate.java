package validation;

import java.time.LocalDate;
import java.util.HashMap;

import core.Pen;
import customEnum.BrandEnum;

public class Populate {
	public static HashMap<Integer, Pen> populateAll(){
		HashMap<Integer, Pen> hm=new HashMap<>();
		
		
		
		
		hm.put(101, new Pen(101,BrandEnum.REYNOLDS, "Blue", "Blue",10, LocalDate.parse("2023-09-24"),
				LocalDate.parse("2022-10-15"), 10));
		hm.put(102, new Pen(102,BrandEnum.PARKER, "Black", "Blue",15, LocalDate.parse("2023-01-24"),
				LocalDate.parse("2022-05-15"), 10));
		hm.put(103, new Pen(103,BrandEnum.CELLO, "Black", "Blue",15, LocalDate.parse("2022-11-24"),
				LocalDate.parse("2022-06-15"), 10));
		return hm;
	}

}
