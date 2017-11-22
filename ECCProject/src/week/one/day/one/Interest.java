package week.one.day.one;

import java.util.Scanner;

public class Interest {
	public static void main(String[] args) {
		System.out.println("Enter interest type:");
		System.out.println(" a) Simple b) Compound");
		Scanner sc = new Scanner(System.in);
		char choise = sc.next().toLowerCase().charAt(0);
		if (choise == 'a' || choise == 'b') {
			System.out.println("Enter Principle : ");
			double p = sc.nextDouble();
			System.out.println("Enter Time in years : ");
			double t = sc.nextDouble();
			System.out.println("Enter Rate of interest : ");
			double r = sc.nextInt();
			double intertest = 0;
			if (choise == 'a') {
				intertest = (p * t * r) / 100;
				System.out.println("Interest after " + t + " years is "+ intertest);
				System.out.println("Total amount to be paid at the end is " + (p + intertest));
			} else if (choise == 'b') {
				System.out.println("Enter interest compount time in years: ");
				double n = sc.nextDouble();
				intertest = (p * (Math.pow((1 + (r / (100 * n))), (t * n))));
				System.out.println("Interest after " + t + " years is " + (intertest - p));
				System.out.println("Total amount to be paid at the end is " + (intertest));
			}
		} else
			System.out.println("Enter correct value");

	}
}
