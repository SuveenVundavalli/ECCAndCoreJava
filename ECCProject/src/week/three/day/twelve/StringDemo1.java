package week.three.day.twelve;

public class StringDemo1 {

	public static void main(String[] args) {

		String str1 = "Talent ";
		String str2 = "Sprint";
		System.out.println("Length of str1 : " + str1.length());
		System.out.println("Length of str2 : " + str2.length());
		System.out.println("str1 in uppercase : " + str1.toUpperCase());
		System.out.println("str2 in lowercase : " + str2.toLowerCase());
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str1.equalsIgnoreCase(str2) : " + str1.equalsIgnoreCase(str2));
		System.out.println("str1.compareTo(str2) : " + str1.compareTo(str2));
		System.out.println("str1.contains(\"Tal\") : " + str1.contains("Tal"));
		System.out.println("str1.chatAt(0) : " + str1.charAt(0));
		System.out.println("str1.indexOf(\"e\") : " + str1.indexOf("e"));
		System.out.println("str1.charAt(str1.indexOf(\"e\")) : " + str1.charAt(str1.indexOf("e")));
		System.out.println("str1.trim() : " + str1.trim());
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
