package week.one.day.three;

import java.util.Scanner;

public class IfDemo1 {

	public static boolean evenOdd(int number) {

		if (number % 2 == 0)
			return true;
		return false;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check even or odd : ");
		int number = sc.nextInt();
		boolean isEven = evenOdd(number);
		if (isEven)
			System.out.println("Even Number");
		else
			System.out.println("Odd number");
	}
}
