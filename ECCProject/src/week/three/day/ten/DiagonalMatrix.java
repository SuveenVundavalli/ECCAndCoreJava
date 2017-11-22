package week.three.day.ten;

import java.util.Scanner;

public class DiagonalMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows : ");
		int rows = sc.nextInt();
		System.out.println("Enter number of columns : ");
		int columns = sc.nextInt();
		int matrix[][] = new int[rows][columns];
		System.out.println("Enter elements in " + matrix.length + "X" + matrix[0].length + " matrix");
		for (int i = 0; i < matrix.length; i++)
			for (int j = 0; j < matrix[0].length; j++)
				matrix[i][j] = sc.nextInt();
		System.out.println(getDiagonalMatrix(matrix));

	}

	private static String getDiagonalMatrix(int[][] matrix) {
		String output = "";
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (i == j) {
					if (matrix[i][j] >= 0 && matrix[i][j] < 10)
						output += (" " + matrix[i][j] + " ");
					else
						output += (matrix[i][j] + " ");
				} else {
					if (matrix[i][j] >= 0 && matrix[i][j] < 10)
						output += ("   ");
					else
						output += ("  ");
				}
			}
			output += "\n";
		}
		return output;
	}

}
