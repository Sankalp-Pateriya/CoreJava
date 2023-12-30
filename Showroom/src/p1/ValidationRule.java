package p1;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

import CustomException.VehicleException;
import e1.Color;

public class ValidationRule {
	public static void validateDup(String ch, List<Vehicle> vehicles)throws VehicleException {
		Vehicle vh = new Vehicle(ch);
		if (vehicles.contains(vh)) {
			throw new VehicleException("Duplicate Entry");
		}
		System.out.println("Not Duplicacy");
	}

	public static Color validateColor(String clr) throws IllegalArgumentException {
		Color c = Color.valueOf(clr.toUpperCase());
		return c;
	}

	public static LocalDate validateDate(String dt)throws DateTimeParseException,VehicleException{
		LocalDate md=LocalDate.parse(dt);
		LocalDate cd=LocalDate.of(2020, 01, 01);
		if(md.isBefore(cd)) {
			throw new VehicleException("Old as per date");
		}
		return md;
		
	}
	
	public static Vehicle validateAllInput(String chasisNo, String vehicleClr, int basePrice, 
			String manufactureDate, String company,List<Vehicle> vehicles)throws IllegalArgumentException,DateTimeParseException,VehicleException {
		validateDup(chasisNo,vehicles);
		Color clr=validateColor(vehicleClr);
		LocalDate ld=validateDate(manufactureDate);
		return new Vehicle(chasisNo,clr,basePrice,ld,company);
	}
}
