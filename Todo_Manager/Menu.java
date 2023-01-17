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

public class Menu {
	public static void main(String[] args) {
		int choice = 0;
		String name = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		name = sc.next();
		
	
		Task task[] = null;
		do {
			System.out.println("*****Menu******");
			System.out.println("1- Adding a new task");
			System.out.println("2- Updating a new task");
			System.out.println("3 -Deleting a new Task");
			System.out.println("4- Searching a new task");
			System.out.println("5 -Exit");
			System.out.println("Please enter your choice! ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: 
				System.out.println("How many task you want to add?");
				int size = sc.nextInt();
				task = new Task[size];
				TaskDAO.add(task, size);
				break;
				
			case 2: 
				TaskDAO.update(task);
				break;
				
			case 3:
				TaskDAO.delete(task);
				break;
				
			case 4:
				TaskDAO.search(task);
				break;
			}
	} while(choice != 5);
	}


}
