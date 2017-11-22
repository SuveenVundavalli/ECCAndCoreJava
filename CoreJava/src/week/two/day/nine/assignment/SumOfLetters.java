package week.two.day.nine.assignment;

import java.util.Scanner;

public class SumOfLetters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter letter to calculate sum : ");
		String input = sc.next().toUpperCase();
		System.out.println(getSum(input));
	}

	private static int getSum(String input) {
		int sum = 0;
		String letters = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < input.length(); i++)
			sum += getFibonacciNumber(letters.indexOf(input.charAt(i)));

		return sum;
	}

	private static int getFibonacciNumber(int letterNumber) {
		int a1 = 0;
		int b1 = 1;
		int temp = 0, count = 0;
		if (letterNumber == 1)
			return 0;
		if (letterNumber == 2)
			return 1;
		while (count < letterNumber - 2) {
			temp = a1;
			a1 = b1;
			b1 = a1 + temp;
			count++;
		}
		return b1;
	}

}
