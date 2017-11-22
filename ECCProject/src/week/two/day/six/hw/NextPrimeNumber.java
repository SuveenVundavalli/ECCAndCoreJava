package week.two.day.six.hw;

import java.util.Scanner;

public class NextPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to get next prime number : ");
		int input = sc.nextInt();
		System.out.println("The next prime number to " + input + " is " + getNextPrime(input));

	}

	public static int getNextPrime(int input) {
		while (!isPrime(++input)) {}

		return input;

	}

	public static boolean isPrime(int inputNumber) {
		for (int i = 2; i <= (inputNumber / 2); i++)
			// System.out.println("input number : "+inputNumber);
			if (inputNumber % i == 0)
				return false;

		return true;
	}

}
