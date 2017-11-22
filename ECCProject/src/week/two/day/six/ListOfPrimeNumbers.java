package week.two.day.six;

import java.util.Scanner;

public class ListOfPrimeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower limit : ");
		int lowerLimit = sc.nextInt();
		System.out.println("Enter upper limit : ");
		int upperLimit = sc.nextInt();

		String primeNumbers = listPrimeNumbers(lowerLimit, upperLimit);
		System.out.println(primeNumbers);

	}

	public static String listPrimeNumbers(int lowerLimit, int upperLimit) {
		String primeNumbers = "";
		boolean isFirst = true;
		for (int i = lowerLimit; i <= upperLimit; i++) {
			if (isPrime(i)) {
				if (isFirst) {
					primeNumbers += i;
					isFirst = false;
				} else
					primeNumbers += "," + i;
			}
		}
		return primeNumbers;
	}

	public static boolean isPrime(int inputNumber) {
		for (int i = 2; i < (inputNumber / 2); i++)
			if (inputNumber % i == 0)
				return false;
		return true;
	}

}
