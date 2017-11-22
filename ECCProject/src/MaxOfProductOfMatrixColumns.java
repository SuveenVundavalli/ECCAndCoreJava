import java.util.Scanner;

public class MaxOfProductOfMatrixColumns {

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
		
		System.out.println("Max Product = "+getMaxProductOfColumns(matrix));
	}

	public static int getMaxProductOfColumns(int[][] matrix) {
		int size = matrix.length;
		int max= 0;
		int product = 1;
		for(int i=0;i<size;i++) {
			product = 1;
			for(int j=0;j<size;j++) {
				product *= matrix[j][i];
			}
			if(product>max) {
				max = product;
			}
			System.out.println("Product of "+(i+1)+" column = "+product);
		}
		
		return max;
	}

}
