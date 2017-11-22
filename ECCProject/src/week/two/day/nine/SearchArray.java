package week.two.day.nine;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		int a[] = { 10, 5, 2, 7, 8 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check in array : ");
		int number = sc.nextInt();

		System.out.println(searchArray(a, number));

	}

	public static String searchArray(int a[], int number) {

		for (int i = 0; i < a.length; i++)
			if (number == a[i])
				return number+" is present in array at a[" + i + "]";

		return "Number not found in array.";

	}

}
