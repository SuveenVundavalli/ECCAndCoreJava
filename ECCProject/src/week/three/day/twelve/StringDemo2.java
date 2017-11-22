package week.three.day.twelve;

public class StringDemo2 {

	public static void main(String[] args) {

		String str1 = "Hello World";
		System.out.println("Line wise : ");
		System.out.println(getCharacters(str1));
		System.out.println();
		System.out.println("Reverse : ");
		System.out.println(getReverse(str1));
		System.out.println();
		System.out.println("Reverse camel case : ");
		System.out.println(getCamelCase(str1));
		

	}

	public static String getCharacters(String str) {
		String output = "";
		for (int i = 0; i < str.length(); i++)
			output += str.charAt(i) + "\n";
		return output;

	}

	public static String getReverse(String str) {
		String output = "";
		for (int i = str.length() - 1; i >= 0; i--)
			output += str.charAt(i);
		return output;

	}

	public static String getCamelCase(String str) {
		String output = "";
		for (int i = str.length() - 1; i >= 0; i--)
			if (i == str.length() - 1 || str.charAt(i + 1) == ' ')
				output += str.toUpperCase().charAt(i);
			else
				output += str.toLowerCase().charAt(i);
		return output;
	}
}
/*
 length() 
 toUpperCase() 
 toLowerCase() 
 equals() 
 equalsIgnoreCase() 
 compareTo() 
 contains() 
 charAt() 
 indexOf()
 toCharArray()
 split()
 trim()
 subString()
 */
