package NewTasks.com.csrk.apps;

public class NumbersDoWhile {

	public static void main(String[] args) {
		int i = 1;

		do {

			int j = 0;
			do {

				System.out.print(j+1);
				j++;

			} while (j < i);

			System.out.println("");
			i++;

		} while (i < 6);

	}


	}


