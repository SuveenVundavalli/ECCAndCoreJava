package week.two.day.six;

import java.util.Scanner;

public class ECCNumberSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int input = sc.nextInt();
		System.out.println(getPattern(input));
	}

	private static String getPattern(int input) {
		String output = "";

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++)
				if (i == 0 || j == 0 || i == 3 || j == 3) {
					output += input;
				} else {
					output += input - 1;
				}
			output += "\n";
		}
		return output;
	}

}
