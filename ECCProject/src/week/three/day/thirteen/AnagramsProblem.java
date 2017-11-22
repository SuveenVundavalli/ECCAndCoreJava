package week.three.day.thirteen;

import java.util.Arrays;
import java.util.Scanner;


public class AnagramsProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first word : ");
		String firstWord = sc.nextLine();
		System.out.println("Enter second word : ");
		String secondWord = sc.nextLine();
		boolean isAnagram = isAnagram(firstWord, secondWord);
		boolean isAnagram1 = isAnagram1(firstWord, secondWord);
		boolean isAnagram2 = isAnagram2(firstWord, secondWord);

		if (isAnagram)
			System.out.println("The given words are anagram");
		else
			System.out.println("The given words are not anagram");
		if (isAnagram1)
			System.out.println("The given words are anagram");
		else
			System.out.println("The given words are not anagram");
		if (isAnagram2)
			System.out.println("The given words are anagram");
		else
			System.out.println("The given words are not anagram");
	}

	private static boolean isAnagram1(String firstWord, String secondWord) {
		if(sort1(firstWord).equals(sort1(secondWord))){
			return true;
		}
		return false;
	}
	private static boolean isAnagram2(String firstWord, String secondWord) {
		if(sort2(firstWord).equals(sort2(secondWord))){
			return true;
		}
		return false;
	}

	private static boolean isAnagram(String firstWord, String secondWord) {
		if (firstWord.length() == secondWord.length()) {
			for (int i = 0; i < secondWord.length(); i++) {
				if (!firstWord.toLowerCase().contains("" + secondWord.toLowerCase().charAt(i))) {
					return false;
				}
				if (!secondWord.toLowerCase().contains("" + firstWord.toLowerCase().charAt(i))) {
					return false;
				}
			}
			return true;
		}
		return false;

	}
	
	private static String sort1(String word){
		
		char letters[] = word.toCharArray();
		char temp;
		for(int i=0;i<letters.length-1;i++){
			for(int j=i+1;j<letters.length;j++){
				if(letters[i]<letters[j]){
					temp = letters[j];
					letters[j] = letters[i];
					letters[i] = temp;
				}
			}
		}
		return new String(letters);
	}
	
private static String sort2(String word){
		
		char letters[] = word.toCharArray();
		Arrays.sort(letters);
		return new String(letters);
	}

}