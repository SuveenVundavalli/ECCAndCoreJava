package week.three.day.twelve;

import java.util.Scanner;

public class StringDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check for number of vowels : ");
		String input = sc.nextLine();
		int numberOfVowels1 = getNumberOfVowels1(input);
		int numberOfVowels2 = getNumberOfVowels2(input);
		int numberOfVowels3 = getNumberOfVowels3(input);
		System.out.println("no. of Vowels 1 = " + numberOfVowels1);
		System.out.println("no. of Vowels 2 = " + numberOfVowels2);
		System.out.println("no. of Vowels 3 = " + numberOfVowels3);
	}

	private static int getNumberOfVowels3(String input) {
		input = input.toUpperCase();
		String temp="";
		int counter = 0;
		for(int i=0;i<input.length();i++){
			temp=""+input.charAt(i);
			if (temp.contains("A")) 
				counter++;
			if (temp.contains("E")) 
				counter++;
			if (temp.contains("I")) 
				counter++;
			if (temp.contains("O")) 
				counter++;
			if (temp.contains("U")) 
				counter++;
		}
			
		return counter;

	}

	private static int getNumberOfVowels1(String input) {
		int count = 0;
		char thisChar;
		input = input.toLowerCase();
		for (int i = 0; i < input.length(); i++) {
			thisChar = input.charAt(i);
			if (thisChar == 'a' || thisChar == 'e' || thisChar == 'i' || thisChar == 'o' || thisChar == 'u')
				count++;
		}
		return count;
	}

	private static int getNumberOfVowels2(String input) {
		int count = 0;
		input = input.toLowerCase();
		for (int i = 0; i < input.length(); i++) {
			switch (input.charAt(i)) {
			case 'a':
				count++;
				break;
			case 'e':
				count++;
				break;
			case 'i':
				count++;
				break;
			case 'o':
				count++;
				break;
			case 'u':
				count++;
				break;

			default:
				break;
			}
		}
		return count;
	}

}
