package core;

import java.time.LocalDate;

public class Task implements Comparable<Task> {
	//taskId, taskName, description, taskDate, status, active
	public static int idGen=105;
	private int taskId;
	private String taskName;
	private String description;
	private LocalDate taskDate;
	private EnumStatus status;
	private boolean active;
	
	public Task(int id, String taskName, String description, LocalDate taskDate, EnumStatus status,
			boolean active) {
		super();
		this.taskId = id;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		this.status = status;
		this.active = active;
	}
	
	
	
	public Task(int taskId) {
		super();
		this.taskId = taskId;
	}



	public boolean isActive() {
		return active;
	}



	public void setActive(boolean active) {
		this.active = active;
	}



	public EnumStatus getStatus() {
		return status;
	}



	public void setStatus(EnumStatus status) {
		this.status = status;
	}
	
	
	
	

	public LocalDate getTaskDate() {
		return taskDate;
	}



	@Override
	public boolean equals(Object o) {
	   
	    Task otherTask = (Task) o;
	    return this.taskId == otherTask.taskId;
	}
	
	



	@Override
	public int compareTo(Task o) {
		
		return o.taskDate.compareTo(this.taskDate);
	}



	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", description=" + description + ", taskDate="
				+ taskDate + ", status=" + status + ", active=" + active + "]";
	}


	
	
	
}
