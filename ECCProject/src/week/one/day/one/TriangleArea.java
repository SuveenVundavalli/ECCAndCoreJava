package week.one.day.one;

import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double side1,side2,side3;
		
		System.out.println("Enter length of side 1 : ");
		side1 = sc.nextDouble();
		System.out.println("Enter length of side 2 : ");
		side2 = sc.nextDouble();
		System.out.println("Enter length of side 3 : ");
		side3 = sc.nextDouble();
		
		double perimeter = (side1+side2+side3)/2;
		
		double area = Math.sqrt(perimeter*(perimeter-side1)*(perimeter-side2)*(perimeter-side3));
		
		System.out.println("Area of triangle : "+area);
	}

}
