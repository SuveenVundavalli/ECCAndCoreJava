package week.two.day.seven;

import java.util.Scanner;

public class NumbersPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of layers : ");
		int layers = sc.nextInt();
		System.out.println(printNumbersPyramid(layers));
	}

	private static String printNumbersPyramid(int layers) {
		String output = "";
		int num=0;
		for(int i=1; i<=layers;i++){
			for(int j=layers;j>=i;j--){
				output+=" ";
			}
			for(int k=1; k<=i;k++){
				output+=" "+(++num);
			}
			output+="\n";
		}
		
		
		return output;
	}

}
