package week.two.day.seven;

import java.util.Scanner;

public class PyramidPattern01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many layers you want to print : ");
		int layers = sc.nextInt();
		System.out.println(getStartPattern(layers));

	}

	private static String getStartPattern(int layers) {
		String output = "";
		for (int i = 1; i <= layers; i++) {

			for (int j = 1; j <= i; j++) {

				output += "*";
			}
			output += "\n";
		}
		return output;
	}

}
