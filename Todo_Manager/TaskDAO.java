/**
 * 
 */
package Todo_Manager;

import java.util.Scanner;

/**
 * @author : Thanh
 * @date   : Jan 16, 2023
 * 
 */
public class TaskDAO {
	public static void add(Task[] task, int size) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < task.length; i++) {
			Task task1 = new Task(i, null);
			System.out.println("Please enter task ID: ");
			int taskId = sc.nextInt();
			
			System.out.println("Please enter task name: ");
			String taskName = sc.next();
			
			task1.setTaskId(taskId);
			task1.setTaskName(taskName);
			
			task[i] = task1;		
		}
		System.out.println("Tasks added successfully!");
	}
	
	public static void update(Task task[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter task ID: ");
		int no = sc.nextInt();
		
		for (int i =0; i< task.length; i++) {
			if (no == task[i].getTaskId()) {
				System.out.println("Please update new task name: ");
				String newName = sc.next();
				task[i].setTaskName(newName);
			}
		}	
		System.out.println("Tasks updated successfully!");
		sc.close();
	}
	public static void delete(Task task[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Pplease enter task ID that you want to delete: ");
		int deleteId = sc.nextInt();
		
		for (int i=0; i< task.length; i++) {
			if (deleteId == task[i].getTaskId()) {
				task[i].taskName = null;
			}
		}
		System.out.println("Task deleted successfully!");
		sc.close();
	}
	
	
	public static boolean search(Task task[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter task ID you want to search: " );
		int searchId = sc.nextInt();
		
		for (int i=0; i<task.length;i++) {
			if (task[i].getTaskId() == searchId) {
				return true;
				
			} 
		}
		return false;
	}
}


