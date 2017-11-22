package week.three.day.thirteen;

import java.util.Scanner;

public class SalesBoySum {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pattern : ");
		String input = sc.next();
		//test input = ^^vvvv^^^^^vvvv^^^
		System.out.println(getTargetFloorAndVisits(input));
	}

	private static String getTargetFloorAndVisits(String input) {
		int target = 0, groundVisits = 1;
		char thisChar;
		for (int i = 0; i < input.length(); i++) {
			thisChar = input.charAt(i);
			if (thisChar == '^') {
				target++;
			} else if (thisChar == 'v') {
				target--;
			} else {
				return "error";
			}
			if (target == 0)
				groundVisits++;
		}
		return "Targer Floor is : " + target + " and ground floor visits : " + groundVisits;
	}

}
