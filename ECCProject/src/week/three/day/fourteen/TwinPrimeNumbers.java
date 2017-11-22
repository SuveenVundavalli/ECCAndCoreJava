package week.three.day.fourteen;

import java.util.Scanner;

public class TwinPrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower limit");
		final int LOWERLIMIT = sc.nextInt();
		System.out.println("Enter upper limit");
		final int UPPERLIMIT = sc.nextInt();
		System.out.println("List of all twin prime numbers between " + LOWERLIMIT + " and " + UPPERLIMIT + " are as follows:");
		System.out.println(getTwinPrimeNumbers(LOWERLIMIT, UPPERLIMIT));
	}

	private static String getTwinPrimeNumbers(int lowerLimit, int upperLimit) {
		String output = "";
		for (int i = lowerLimit; i < upperLimit - 2; i++)
			if (isPrime(i) && isPrime((i + 2)))
				output += i + "," + (i + 2) + " - ";
		output = output.substring(0, output.length() - 3);
		return output;
	}

	private static boolean isPrime(int number) {
		if (number == 1) {
			return false;
		}
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}