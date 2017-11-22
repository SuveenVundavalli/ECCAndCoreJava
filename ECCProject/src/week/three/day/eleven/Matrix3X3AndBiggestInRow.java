package week.three.day.eleven;

import java.util.Scanner;

public class Matrix3X3AndBiggestInRow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows : ");
		int rows = sc.nextInt();
		System.out.println("Enter no. of columns : ");
		int columns = sc.nextInt();
		int matrix[][] = new int[rows][columns];
		System.out.println("Enter " + rows + "X" + columns + " matrix values");
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < columns; j++)
				matrix[i][j] = sc.nextInt();

		System.out.println(get3X3MatrixWithBiggestValues(matrix));
	}

	private static String get3X3MatrixWithBiggestValues(int[][] matrix) {

		String output = "";
		int max;
		for (int i = 0; i < matrix.length; i++) {
			max = 0;
			for (int j = 0; j < matrix[0].length; j++) {
				output += matrix[i][j] + "\t";
				if (max < matrix[i][j])
					max = matrix[i][j];
			}
			output += "Big = " + max + "\n";
		}

		return output;
	}

}
