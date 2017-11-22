package week.three.day.eleven;

public class StringImmutableExample {

	public static void main(String[] args) {
		String str1 = "Hello";
		System.out.println("Value before change : "+str1);
		System.out.println("Address before change : "+str1.hashCode());
		str1 = str1+" Hi";
		System.out.println("Value before change : "+str1);
		System.out.println("Address before change : "+str1.hashCode());
	}

}
