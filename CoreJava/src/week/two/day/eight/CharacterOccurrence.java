package week.two.day.eight;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 Fill the following method with the code to find occurrence of each
 character in the given string and store in a map object then return.

 Ex:- Input :- HELLO WORLD
 Output :- {H=1, E=1, L=3, O=2, W=1, R=1, D=1}
 */

public class CharacterOccurrence {
	public static Map getCharacterOccurrence(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char thisChar = str.charAt(i);
			if (map.containsKey(thisChar)) 
				map.put(thisChar, map.get(thisChar) + 1);
			else
				map.put(thisChar, 1);
		}
		return map;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence to count character sequence : ");
		String str = sc.nextLine().toUpperCase().replace(" ", "");
		Map result = getCharacterOccurrence(str);
		System.out.println(result);
	}
}