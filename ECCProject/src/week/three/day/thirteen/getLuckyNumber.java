package week.three.day.thirteen;

import java.util.Scanner;

public class getLuckyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date in the format dd-mm-yyyy : ");
		String date = sc.nextLine();
		System.out.println("Lucky number is : " + getLuckyNumber1(date));
	}

	private static int getLuckyNumber1(String date) {
		int luckyNumber = 0;
		String dates[] = date.split("-");
		for (int i = 0; i < dates.length; i++) {
			luckyNumber += Integer.parseInt(dates[i]);
		}
		while (luckyNumber > 9) {
			//if Lucky number is less than 10 while loop breaks
			luckyNumber = getLuckyNumberSum(luckyNumber);
		}
		return luckyNumber;
	}

	private static int getLuckyNumberSum(int luckyNumber) {
		int sum = 0;
		while (luckyNumber > 0) {
			sum += luckyNumber % 10;
			luckyNumber /= 10;
		}
		return sum;
	}

}
