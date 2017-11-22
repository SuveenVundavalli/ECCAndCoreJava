package week.two.day.seven;

import java.util.Scanner;

public class BoxPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter box size : ");
		int size = sc.nextInt();
		System.out.println(printBox(size));
	}

	private static String printBox(int size) {
		String output = "";
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++){
				if (i == 1 || i == size || j == 1 || j == size) {
					output += " *";
				} else {
					output += "  ";
				}
			}
			output+="\n";
		}
		return output;
	}

}
