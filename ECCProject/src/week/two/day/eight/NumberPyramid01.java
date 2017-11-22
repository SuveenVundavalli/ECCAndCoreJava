package week.two.day.eight;

import java.util.Scanner;

public class NumberPyramid01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many layers  :");
		int number = sc.nextInt();
		System.out.println(getNumberPyramid(number));

	}

	private static String getNumberPyramid(int number) {
		String output = "";

		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= ((2 * number) - (2 * i)); j++) {
				output += " ";
			}
			for (int k = 1; k <= i; k++) {
				output += k + " ";
			}
			for (int l = (i - 1); l >= 1; l--) {
				output += l + " ";
			}
			output += "\n";
		}

		return output;
	}

}
