package week.two.day.nine;

import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter array values");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sortArray(a);
		System.out.print("After sort : ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}

	private static void sortArray(int[] a) {
		int temp;
		for(int i=0;i<(a.length-1);i++){
			for(int j=i+1;j<=(a.length-1);j++){
				
				if(a[i]>a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		//return a;
	}

}
