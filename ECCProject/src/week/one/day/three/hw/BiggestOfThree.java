package week.one.day.three.hw;

public class BiggestOfThree {

	public static void main(String[] args) {

		int a = 9, b = 5, c = 9;
		System.out.println(biggestOfThree(a, b, c));
	}

	public static String biggestOfThree(int a, int b, int c) {
		if (a > b && a > c)
			return a + " is the biggest";
		else if (b > c)
			return b + " is the biggest";
		else
			return c + " is the biggest";
	}

}
