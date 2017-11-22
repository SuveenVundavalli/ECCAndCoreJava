package week.two.day.five;

public class PalindromeUsingWhileLoop {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		System.out.println("The given number "+number+" is "+isPalindrome(number));

	}

	public static String isPalindrome(int number) {
		int input = number, reverseNumber=0, reminder;
		while(number>0){
			reminder = number%10;
			reverseNumber = (reverseNumber * 10)+reminder;
			number /= 10;
		}
		if(input == reverseNumber)
			return "a Palindrome Number";
		else 
			return "not a Palindrome Number";
	}

}
