import java.util.Scanner;

public class AdamNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check for adam number");
		int input = sc.nextInt();
		if (isAdamNumber(input))
			System.out.println("Adam number");
		else
			System.out.println("Not an adam number");
	}

	private static boolean isAdamNumber(int input) {
		int reverseNumber = getReverse(input);
		return (input * input) == getReverse(reverseNumber * reverseNumber);
	}

	private static int getReverse(int input) {
		int reverseNumber = 0;
		while (input > 0) {
			reverseNumber = reverseNumber * 10 + input % 10;
			input = input / 10;
		}
		return reverseNumber;
	}

}
