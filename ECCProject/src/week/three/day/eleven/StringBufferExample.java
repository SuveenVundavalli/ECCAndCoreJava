package week.three.day.eleven;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("Hello");
		System.out.println("Value before change : "+str1);
		System.out.println("Address before change : "+str1.hashCode());
		str1 = str1.append(" Hi");
		System.out.println("Value before change : "+str1);
		System.out.println("Address before change : "+str1.hashCode());
	}

}
