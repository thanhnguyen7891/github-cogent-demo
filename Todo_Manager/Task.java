/**
 * 
 */
package Todo_Manager;

/**
 * @author : Thanh
 * @date   : Jan 16, 2023
 * 
 */
public class Task {
	int taskId;
	String taskName;
	
	public Task(int taskId, String taskName) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}


}
