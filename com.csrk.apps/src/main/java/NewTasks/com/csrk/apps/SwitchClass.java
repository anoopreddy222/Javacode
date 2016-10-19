package NewTasks.com.csrk.apps;

import java.util.Scanner;

public class SwitchClass {

	public static void main(String[] args) {

		Scanner Key = new Scanner(System.in);

		

		System.out.print("Enter the Month");
		
		String month=Key.nextLine();

		switch (month) {

		case "Jan":

			System.out.println("it is January");
			break;
		case "Feb":

			System.out.println("it is Feb");
			break;

		case "Mar":

			System.out.println("it is Mar");
			break;
			
			default:
				System.out.println("No Match Found");
		}
		Key.close();

	}

}
