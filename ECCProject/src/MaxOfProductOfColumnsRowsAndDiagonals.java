
import java.util.Scanner;

public class MaxOfProductOfColumnsRowsAndDiagonals {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Square matrix : ");
		int size = sc.nextInt();
		int[][] matrix = new int[size][size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter " + (i + 1) + " row values seperated by spaces : ");
			for (int j = 0; j < size; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("The max of product of rows and product of columns is : " + getMaxOfRowsAndColumns1(matrix));

	}

	public static int getMaxOfRowsAndColumns1(int[][] matrix) {
		int size = matrix.length;
		int max = 0;
		int productRows = 1;
		int productColumns = 1;
		int productLR = 1, productRL = 1;
		for (int i = 0; i < size; i++) {
			productRows = 1;
			productColumns = 1;
			productLR = 1;
			productRL = 1;
			for (int j = 0; j < size; j++) {
				productRows *= matrix[i][j];
				productColumns *= matrix[j][i];
				if (i == j)
					productLR *= matrix[i][j];

				if ((i + j) == (size - 1)) {
					productRL *= matrix[i][j];
				}
			}
			if (productRows > max) {
				max = productRows;
			}
			if (productColumns > max) {
				max = productColumns;
			}
			if (productLR > max) {
				max = productLR;
			}
			if (productRL > max) {
				max = productRL;
			}
			// System.out.println("Product of "+(i+1)+" row = "+product);
		}

		return max;
	}

	private static int getMaxOfRowsAndColumns(int[][] matrix) {
		int rows, columns, diagonals, max;
		columns = MaxOfProductOfMatrixColumns.getMaxProductOfColumns(matrix);
		rows = MaxOfProductOfMatrixRows.getMaxProductOfRows(matrix);
		diagonals = MaxOfProductOfMatrixDiagonals.getMaxProductOfDiagonals(matrix);
		max = columns;
		if (max < rows)
			max = rows;
		if (max < diagonals)
			max = diagonals;
		return max;
	}

}
