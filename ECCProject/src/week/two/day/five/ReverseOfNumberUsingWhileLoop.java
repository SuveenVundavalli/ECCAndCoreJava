package week.two.day.five;

public class ReverseOfNumberUsingWhileLoop {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		System.out.println("The sum of digits of number "+number+" is "+getReverseOfNumber(number));

	}

	public static int getReverseOfNumber(int number) {
		int reverseNumber=0, reminder;
		while(number>0){
			reminder = number%10;
			reverseNumber = (reverseNumber * 10)+reminder;
			number /= 10;
		}
		return reverseNumber;
	}
	
	

}
