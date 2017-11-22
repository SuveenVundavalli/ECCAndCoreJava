import java.util.Arrays;
import java.util.Scanner;

public class MaxOfProductOfMatrixDiagonals {

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

		System.out.println("Max Product = " + getMaxProductOfDiagonals(matrix));
	}

	public static int getMaxProductOfDiagonals(int[][] matrix) {
		int size = matrix.length;
		int productlr = 1, productrl = 1;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i == j)
					productlr *= matrix[i][j];

				if ((i + j) == (size - 1)) {
					productrl *= matrix[i][j];
				}
			}

		}
		System.out.println("Product of Left-Right Diagonal = "+productlr);
		System.out.println("Product of Right-Left Diagonal = "+productrl);
		if (productlr > productrl)
			return productlr;
		return productrl;
	}

}
