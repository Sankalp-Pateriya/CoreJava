package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import core.EnumStatus;
import core.Task;

public class Populate {
	public static List<Task> populateList(){
		List<Task> tlst=new ArrayList<Task>();
		//String taskName, String description, LocalDate taskDate, EnumStatus status,boolean active
		
		tlst.add(0, new Task(101,"ms","notes",LocalDate.parse("2023-10-12"),EnumStatus.PENDING,true));
		tlst.add(0, new Task(102,"ms","notes",LocalDate.parse("2023-10-25"),EnumStatus.PENDING,false));
		tlst.add(0, new Task(103,"ms","notes",LocalDate.parse("2023-10-12"),EnumStatus.COMPLETED,true));
		tlst.add(0, new Task(104,"ms","notes",LocalDate.parse("2023-10-24"),EnumStatus.PENDING,false));
		tlst.add(0, new Task(105,"ms","notes",LocalDate.parse("2023-10-25"),EnumStatus.COMPLETED,true));
		
		return tlst;
	}
}
