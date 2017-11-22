package week.two.day.six;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String name = sc.next();
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter your salary : ");
		double salary = sc.nextDouble();
		
		System.out.println("Your Name : "+name);
		System.out.println("Your Age : "+age);
		System.out.println("Your Salary : "+salary);

	}

}
