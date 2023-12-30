package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import core.EnumStatus;
import core.Task;
import customException.TaskException;
import validation.Validity;

public class Main {

	public static void main(String[] args) throws TaskException {
		List<Task> lst = new ArrayList<>();
		lst=Populate.populateList();
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println(
							"1. Add Task\n" + "2. Delete Task\n" + "3.Update Task Status\n" + "4. Display All Pending\n"
									+ "5. Display All Pending for today\n" + "6. Sort b TaskDate\n"
									+"7. Sort By Status\n"+"8. Display\n"+ "Enter Choice:");
					switch (sc.nextInt()) {
					case 0:
						exit = true;
						break;

					case 1:
						System.out.println("Enter taskName, description, taskDate, status");
						// taskId, taskName, description, taskDate, status, active
						Task t = Validity.validateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(), true, lst);
						lst.add(t);
						System.out.println("Task Added!!");
						break;

					case 2:
						System.out.println("Enter TaskID");
						int id = sc.nextInt();
						t = new Task(id);
						System.out.println(lst);

						if (lst.contains(t)) {

							t = lst.get(lst.indexOf(t));
							t.setActive(false);
							System.out.println("DOne!!");
						} else
							throw new TaskException("Task Not Found!!");
						break;

					case 3:
						System.out.println("Enter TaskID");
						id = sc.nextInt();
						t = new Task(id);
						if (lst.contains(t)) {
							t = lst.get(lst.indexOf(t));
							System.out.println("Enter New Status:");
							t.setStatus(Validity.parseEnum(sc.next().toUpperCase()));
							System.out.println("Done");
						} else
							throw new TaskException("Task Not Found!!");
						break;

					case 4:
						lst.stream().
						filter(i -> (i.getStatus()==EnumStatus.PENDING)).
						forEach(j->System.out.println(j));
						break;
						
					case 5:
						lst.stream().
						filter(i->(i.getTaskDate().equals(LocalDate.now()))).
						filter(i->(i.getStatus()==EnumStatus.PENDING)).
						forEach(i->System.out.println(i));
						break;
						
					case 6:
						lst.stream().sorted().forEach(i->System.out.println(i));
						break;
						
					case 7:
						lst.sort(new SortByStatus());
						break;
						
					case 8:
						for (Task t1 : lst) {
							System.out.println(t1);
						}
						break;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					sc.nextLine();
				}
			}
		}
	}

}
