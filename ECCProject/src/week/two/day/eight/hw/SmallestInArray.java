package week.two.day.eight.hw;

import java.util.Scanner;

public class SmallestInArray {

	public static void main(String[] args) {
		                                                       
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of numbers to compare");
		int numberOfNumbers = sc.nextInt();
		int numbers[] = new int[numberOfNumbers];
		for(int i=0;i<numberOfNumbers;i++){
			System.out.println("Enter "+(i+1)+" number : ");
			numbers[i] = sc.nextInt();
		}
		
		System.out.println("The smallest number is : "+getSmallestNumber(numbers));

	}

	private static int getSmallestNumber(int[] numbers) {
		int smallest = numbers[0];
		for(int i=0;i<numbers.length;i++){
			if(smallest>numbers[i])
				smallest = numbers[i];
		}
		return smallest;
	}

}
