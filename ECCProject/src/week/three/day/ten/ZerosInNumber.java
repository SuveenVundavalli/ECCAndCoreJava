package week.three.day.ten;

import java.util.Scanner;

public class ZerosInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();

		System.out.println("The number of zeros in given array is : " + getZerosInNumber(number));

	}

	private static int getZerosInNumber(int number) {
		int noOfZeros = 0;

		while (number > 0) {
			if (number % 10 == 0)
				noOfZeros++;
			number /= 10;
		}

		return noOfZeros;
	}

}
