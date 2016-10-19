package NewTasks.com.csrk.apps;

public class StringMethods {

	public static void main(String[] args) {
		int i = 10;
		String a = "Anoop";
		String b = "   Anoop Reddy  ";
		//String w="I am a good boy";

		System.out.println(a.length()); // displays length of chars
		System.out.println(b.toLowerCase()); // makes characters to lowercase
		System.out.println(b.toUpperCase()); // makes characters to uppercase
		System.out.println(a.charAt(1)); // displays the character at specified
											// index
		System.out.println(b.trim()); // trims the spaces before and after the
										// characters
		System.out.println(a.endsWith("p")); // checks the string ends with p
		System.out.println(b.startsWith("A"));
		System.out.println(a.replaceFirst("A", "B"));
		System.out.println(a.replaceAll("Ano", "Aravind"));
		String j = String.valueOf(i);

		System.out.println(i + j); // string concatination
		System.out.println(a.contains("A")); // checks the given char is present
												// in string
		System.out.println(a.compareTo("Anoop reddy"));
		System.out.println(a.equalsIgnoreCase("ANOOP")); // compare the strings
															// but casesensitve
	 System.out.println(a.concat("Reddy Kunta"));
	 System.out.println(a.concat(b));
	 System.out.println(a.isEmpty());
	 System.out.println(a.substring(2));
	 
	 
	 

	}

}
