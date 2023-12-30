package util;

import java.util.ArrayList;
import java.util.List;

import core.Brand;
import core.Category;
import core.Material;
import core.Shape;
import core.Watch;
import core.WatchStyle;
import static java.time.LocalDate.parse;

public class Populate {
	public static List<Watch> populateAll(){
		
		List<Watch> lst=new ArrayList<>();
		
		lst.add(new Watch("abc",Category.MEN, Brand.CASIO,Shape.RECTANGLE,WatchStyle.CASUAL,Material.CERAMIC,180,parse("2021-10-20")
				,parse("2023-01-10"),10000,0.0));
		
		lst.add(new Watch("def",Category.WOMEN, Brand.TITAN,Shape.ROUND,WatchStyle.CASUAL,Material.CERAMIC,150,parse("2021-10-20")
				,parse("2022-07-10"),20000,0.0));
		
		lst.add(new Watch("xyz",Category.MEN, Brand.CASIO,Shape.RECTANGLE,WatchStyle.CASUAL,Material.CERAMIC,100,parse("2023-04-20")
				,parse("2023-08-10"),15000,0.0));
		
		lst.add(new Watch("abc",Category.MEN, Brand.CASIO,Shape.RECTANGLE,WatchStyle.CASUAL,Material.CERAMIC,110,parse("2021-01-20")
				,parse("2021-10-10"),25000,0.0));
		
		
		
		return lst;
	}
}
