package week.one.day.three.assignments;

import java.util.Scanner;

public class CharPyramid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of pyramid layers : ");
		int layers = sc.nextInt();
		System.out.println(getPyramidOfLayers(layers));
		System.out.println(getPyramidOfLayers1(layers));
		System.out.println(getPyramidOfLayers2(layers));
	}

	public static String getPyramidOfLayers2(int n){
		String output = "";
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int temp = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<(n-i);j++){
				output+=" ";
			}
			for(int k=0;k<=i;k++){
				output += letters.charAt(k);
				temp = k-1;
			}
			for(int l=temp;l>=0;l--){
				output += letters.charAt(l);
			}
			
			output += "\n";
		}
		
		return output;
		
	}
	
	public static String getPyramidOfLayers(int n) {
		char ch;
		String output = "";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - (i + 1); j++) {
				output += " ";
			}
			for (ch = 'A'; ch < ('A' + i); ch++) {
				output += ch;
			}
			for (; ch >= 'A'; ch--) {
				output += ch;
			}
			output += "\n";
		}
		return output;
	}

	public static String getPyramidOfLayers1(int n) {
		char ch;
		String output = "";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (2 * (n - i) - 1); j++) {
				output += " ";
			}
			for (ch = 'A'; ch < ('A' + i); ch++) {
				output += " " + ch;
			}
			for (; ch >= 'A'; ch--) {
				output += " " + ch;
			}
			output += "\n";
		}
		return output;
	}

}