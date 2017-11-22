package week.one.day.two;

import java.util.Scanner;

public class SumOfDigits {

	public static int getSumOfDigits(int num){
		boolean size = true;
		int sum = 0;
		while(size) {
			int temp =  num%10;
			num /= 10;
			sum +=temp;
			if (num == 0)
				size=false;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to calculate sum of digits : ");
		int num = sc.nextInt();
		int sum = getSumOfDigits(num);
		System.out.println(sum);
		System.out.println("Done!");
	}

}
