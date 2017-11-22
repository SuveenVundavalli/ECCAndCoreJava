package week.one.day.three;

public class CommandLineDemo2BiggestNumber {

	public static String findBig(int a, int b) {

		if (a > b)
			return a + " is grater than " + b;
		else if (b > a)
			return b + " is grater than " + a;
		else
			return a + " and  " + b + " both are equal!";

	}

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.println(findBig(a, b));

	}

}
