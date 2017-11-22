package week.three.day.ten;

import java.util.Scanner;

public class ZerosInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array : ");
		int size = sc.nextInt();
		int numbers[] = new int[size];
		System.out.println("Enter numbers in array : ");
		for (int i = 0; i < size; i++)
			numbers[i] = sc.nextInt();

		System.out.println("The number of zeros in given array is : " + getNumberOfZerosInArray(numbers));

	}

	private static int getNumberOfZerosInArray(int[] numbers) {
		int totalZeros = 0;

		for (int i = 0; i < numbers.length; i++)
			totalZeros += getZerosInNumber(numbers[i]);

		return totalZeros;
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
