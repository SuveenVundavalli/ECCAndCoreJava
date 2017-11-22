package week.two.day.nine.assignment;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SumOfLetters1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter letter to calculate sum : ");
		String input = sc.next().toUpperCase();
		System.out.println(getSum(input));
	}

	private static int getSum(String input) {
		int sum=0;
		int temp;
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		map.put('A', 0);
		map.put('B', 1);
		for(int i=2;i<characters.length();i++){
			temp = map.get(characters.charAt(i-1))+map.get(characters.charAt(i-2));
			map.put(characters.charAt(i), temp);
		}
		//System.out.println(map);
		for(int i=0;i<input.length();i++){
			sum += map.get(input.charAt(i));
		}
		
		return sum;
	}

	

}
