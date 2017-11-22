package week.two.day.ten.assignment;

import java.util.Scanner;

public class ReverseCharactesInWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to perform reverse manipulation");
		String input = sc.nextLine().toLowerCase();
		System.out.println(getReverseString(input));
	}

	private static String getReverseString(String input) {
		String output="";
		String[] inputWords = input.split(" ");
		StringBuffer temp;
		for(int i=0;i<inputWords.length;i++){
			temp = new StringBuffer(inputWords[i]);
			inputWords[i] = temp.reverse().toString()+" ";
			output += inputWords[i].toUpperCase().charAt(0)+inputWords[i].substring(1,inputWords[i].length())+" ";
		}
		
		
		return output;
	}
}
///home/tsuser/Desktop/C01_SuveenKumarVundavalli/CoreJava/src/week/two/day