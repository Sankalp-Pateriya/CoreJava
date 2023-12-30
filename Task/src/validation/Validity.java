package validation;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

import core.EnumStatus;
import core.Task;
import customException.TaskException;

public class Validity {

//	public static void checkDup(int id,List<Task> lst)throws TaskException {
//		Task t=new Task(id);
//		if(lst.contains(t))
//			throw new TaskException("Duplicate Task!!");
//		else
//			System.out.println("Continue to Add");
//	}
	
	public static LocalDate parseDte(String dte)throws DateTimeParseException{
		return LocalDate.parse(dte);
	}
	
	public static EnumStatus parseEnum(String status){
		return EnumStatus.valueOf(status.toUpperCase());
	}
	
	public static Task validateAllInputs(String taskName,String description,String taskDate,String status,boolean active,List<Task> lst)
			throws TaskException{
		LocalDate ld= parseDte(taskDate);
		EnumStatus es= parseEnum(status);
		int id=++Task.idGen;
		Task t=new Task(id,taskName,description,ld,es,active);
		return t;
	}
}
