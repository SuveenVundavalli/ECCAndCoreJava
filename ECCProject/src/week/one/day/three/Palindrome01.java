package week.one.day.three;

public class Palindrome01 {
	public static void main(String[] args) {
		int num = 98898;
		System.out.println(isPalindrome(num));
	}

	public static int isPalindrome(int num) {

		if (num % 10 == num / 100)
			return 1;
		else if (num < 0)
			return -1;
		else
			return 0;

	}

}
