package week.three.day.eleven;

public class StringConstantPool {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hii";
		String str3 = "Hello";
		System.out.println("Comparing values str1 with str2 \t: "+(str1.equals(str2)));
		System.out.println("Comparing objects str1 with str2 \t: "+(str1==str2));
		System.out.println("Comparing values str1 with str3 \t: "+(str1.equals(str3)));
		System.out.println("Comparing objects str1 with str3 \t: "+(str1==str3));
	}

}
