package NewTasks.com.csrk.apps;

import java.util.Scanner;

public class Calculaotr {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);

		System.out.println("Enter the value of a :");

		int a = num.nextInt();

		System.out.println("Enter the value of b :");

		int b = num.nextInt();

		int c = a + b;

		System.out.println("addition of two integers" + c);

		int d = a - b;
		System.out.println("substraction of two integers" + d);

		int e = a * b;
		System.out.println("multiplication of two integers" + e);
		
		int f = a / b;
		System.out.println("division of two integers" + f);
		
		num.close();
	}
	
                
}
