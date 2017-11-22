package week.one.day.one;

import java.util.Scanner;

public class SumOfDigits {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to calculate sum of digits : ");
		int num = sc.nextInt();
		boolean size = true;
		int sum = 0;
		while (size) {
			int temp = num % 10;
			num /= 10;
			sum += temp;
			if (num <= 0)
				size = false;
		}
		System.out.println(sum);
		System.out.println("Done!");
	}

}
