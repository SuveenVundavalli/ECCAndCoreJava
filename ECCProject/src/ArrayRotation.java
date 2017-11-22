import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 2, 3, 4, 5 };

		ArrayRotation.getRotatedArray(arr, 3);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	private static void getRotatedArray(int[] arr, int num) {
		int temp = 0;
		for (int j = 1; j <= num; j++) {
			temp = arr[arr.length - 1];
			for (int i = 1; i < arr.length; i++) 
				arr[arr.length - (i)] = arr[arr.length - (i + 1)];
			arr[0] = temp;
		}
	}

}
