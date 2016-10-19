package NewTasks.com.csrk.apps;

public class NumbersWhile {

	public static void main(String[] args) {
		int i = 1;

		while (i < 6) {
			int j = 0;

			while (j < i) {
				System.out.print(j+1);
				j++;

			}
			System.out.println("");
			i++;

		}

	}

}
