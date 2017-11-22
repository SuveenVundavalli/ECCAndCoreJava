package week.one.day.four;

public class BiggestOfThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		System.out.println("The biggest number is : " + findBiggestOfThree(a, b, c));
	}

	public static int findBiggestOfThree(int a, int b, int c) {
		int big = a;
		if (b > big)
			big = b;
		if (c > big)
			big = c;
		return big;
	}

}
