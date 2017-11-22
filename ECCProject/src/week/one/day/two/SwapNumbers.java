package week.one.day.two;

import java.util.Scanner;

public class SwapNumbers {

	public static String swapNumbers(int a, int b) {
		a = a + b;
		b = a - b;
		a = a - b;
		return ("A = " + a + " B = " + b);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int a = input.nextInt();
		System.out.println("");
		System.out.print("Enter Second Number : ");
		int b = input.nextInt();
		System.out.println("");

		System.out.println("Before swap A = " + a + " B = " + b);

		System.out.println("After swap " + swapNumbers(a, b));

		// 9605
	}

}
