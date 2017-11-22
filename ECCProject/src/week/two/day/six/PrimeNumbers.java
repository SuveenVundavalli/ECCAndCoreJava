package week.two.day.six;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to check for a prime number : ");

		int inputNumber = sc.nextInt();

		boolean isPrime = isPrime(inputNumber);
		if(isPrime)
			System.out.println("The number "+inputNumber+" is a prime number");
		else 
			System.out.println("The number "+inputNumber+" is not a prime number");

	}

	public static boolean isPrime(int inputNumber) {
		for (int i = 2; i < (inputNumber / 2); i++)
			if (inputNumber % i == 0)
				return false;

		return true;
	}

}
