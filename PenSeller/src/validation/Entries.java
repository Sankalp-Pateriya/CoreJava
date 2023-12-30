package validation;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import java.util.HashMap;

import core.Pen;
import customEnum.BrandEnum;
import customException.PenException;

public class Entries {

	public static void validDups(int id, HashMap<Integer, Pen> penlst) throws PenException {
		if (!penlst.containsKey(id))
			throw new PenException("Invalid ID!!");

	}

	public static LocalDate parseDte(String dte) throws DateTimeParseException {
		return LocalDate.parse(dte);
	}

	public static BrandEnum validateEnum(String brand) {
		return BrandEnum.valueOf(brand.toUpperCase());
	}

	public static Pen addPen(String brand, String color, String inkclr, int stock, String stkUpdateDate,
			String stkListingDate, double price, HashMap<Integer, Pen> penlst) throws PenException {
		LocalDate stkUpdateDate1 = parseDte(stkUpdateDate);
		LocalDate stkListingeDate1 = parseDte(stkListingDate);
		BrandEnum brand1 = validateEnum(brand);
		int id=Pen.genID++;
		Pen p = new Pen(id, brand1, color, inkclr, stock, stkUpdateDate1, stkListingeDate1, price);
		return p;
	}

}
