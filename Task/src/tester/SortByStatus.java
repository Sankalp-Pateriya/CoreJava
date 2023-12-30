package tester;

import java.util.Comparator;

import core.Task;

public class SortByStatus implements Comparator<Task>{

	@Override
	public int compare(Task o1, Task o2) {
		
		return o1.getStatus().toString().compareTo(o2.getStatus().toString());
	}

}
