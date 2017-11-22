package week.three.day.ten;

import java.util.Scanner;

public class SecondMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		System.out.println("The second biggest number in the given number is : " + getMaxAndSecondMax(number));
	}

	private static String getMaxAndSecondMax(int number) {
		int max=0, secondMax=0;
		int reminder;
		while(number>0){
			reminder = number%10;
			if(max<reminder){
				secondMax = max;
				max = reminder;
			} else if(secondMax<reminder && reminder != max){
				secondMax = reminder;
			}
			number/=10;
		}
		
		
		
		return "First max : "+max+"\nSecond max: "+secondMax;
	}

}
