package week.three.day.twelve;

import java.util.Scanner;

public class NumberOfCapsSmallsAndSymbols {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String input = sc.nextLine();
		System.out.println(getInputTypes(input));
	}

	private static String getInputTypes(String input) {
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String capitalLetters = smallLetters.toUpperCase();
		int smalls = 0, caps = 0, symbols = 0;
		for (int i = 0; i < input.length(); i++) {
			if (smallLetters.contains("" + input.charAt(i))) {
				smalls++;
			} else if (capitalLetters.contains("" + input.charAt(i))) {
				caps++;
			} else {
				symbols++;
			}
		}
		return "Smalls = " + smalls + "\nCaps = " + caps + "\nSymbols = " + symbols;

	}

}