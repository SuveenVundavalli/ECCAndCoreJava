import java.util.Scanner;

public class RaghavendraSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array : ");
		int length = sc.nextInt();
		int arr[] = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.println("Enter " + (i + 1) + " number : ");
			arr[i] = sc.nextInt();
		}
		System.out.println(getSeries(arr));
	}

	private static String getSeries(int[] arr) {
		String output = "";
		boolean trigger = true;
		for (int i = 0; i < arr.length - 1; i++) {
			trigger = true;
			for (int j = i + 1; j <= arr.length - 1; j++)

				if (arr[i] < arr[j])
					trigger = false;
			if (trigger)
				output += arr[i] + " ";
		}
		output += arr[arr.length - 1];
		return output;
	}

}
