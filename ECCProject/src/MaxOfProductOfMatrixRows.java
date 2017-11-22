import java.util.Arrays;
import java.util.Scanner;

public class MaxOfProductOfMatrixRows {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Square matrix : ");
		int size = sc.nextInt();
		int[][] matrix = new int[size][size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter "+(i+1)+" row values seperated by spaces : ");
			for(int j=0;j<size;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Max Product = "+getMaxProductOfRows(matrix));
	}

	public static int getMaxProductOfRows(int[][] matrix) {
		int size = matrix.length;
		int max= 0;
		int product = 1;
		for(int i=0;i<size;i++) {
			product = 1;
			for(int j=0;j<size;j++) {
				product *= matrix[i][j];
			}
			if(product>max) {
				max = product;
			}
			System.out.println("Product of "+(i+1)+" row = "+product);
		}
		
		return max;
	}

}
