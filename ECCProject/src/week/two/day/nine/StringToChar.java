package week.two.day.nine;

import java.util.Scanner;

public class StringToChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to convert to char");
		String input = sc.nextLine();
		char[] inputInString = getAsChar(input);
		for(int i=0;i<inputInString.length;i++){
			System.out.print(inputInString[i]);
		}
	}

	private static char[] getAsChar(String input) {
		System.out.println(input.length());
		char[] output = new char[input.length()];
		for (int i = 0; i < input.length(); i++)
			output[i] = input.charAt(i);
		return output;
	}

}
