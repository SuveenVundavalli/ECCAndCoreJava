import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MaxOfProductOfColumnsAndRows {

	public static void main(String[] args) {
		MaxOfProductOfMatrixColumns columns = new MaxOfProductOfMatrixColumns();
		MaxOfProductOfMatrixRows rows = new MaxOfProductOfMatrixRows();
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
		
		System.out.println("The max of product of rows and product of columns is : "+getMaxOfRowsAndColumns(matrix));
		
		
		

		
	}

	private static int getMaxOfRowsAndColumns(int[][] matrix) {
		int rows, columns;
		 columns = MaxOfProductOfMatrixColumns.getMaxProductOfColumns(matrix);
		 rows = MaxOfProductOfMatrixRows.getMaxProductOfRows(matrix);
		if(rows>columns) {
			return rows;
		}
		return columns;
	}

}
