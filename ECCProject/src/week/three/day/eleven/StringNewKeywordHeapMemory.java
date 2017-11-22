package week.three.day.eleven;

public class StringNewKeywordHeapMemory {

	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hii");
		String str3 = new String("Hello");
		System.out.println("Comparing values str1 with str2 \t: "+(str1.equals(str2)));
		System.out.println("Comparing objects str1 with str2 \t: "+(str1==str2));
		System.out.println("Comparing values str1 with str3 \t: "+(str1.equals(str3)));
		System.out.println("Comparing objects str1 with str3 \t: "+(str1==str3));
	}

}
