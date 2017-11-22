package week.two.day.eight.hw;

import java.util.Scanner;

public class MaxDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Emter a number to find biggest digit : ");
		int input = sc.nextInt();
		System.out.println("Biggest number is " + getBiggestNumber(input));

	}

	private static int getBiggestNumber(int input) {
		int output = 0;
		int temp;
		while (input > 0) {
			temp = input % 10;
			input /= 10;
			if (output < temp)
				output = temp;
		}

		return output;
	}

}
