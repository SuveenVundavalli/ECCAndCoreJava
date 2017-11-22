package week.two.day.five;

public class SumOfDigitsUsingWhileLoop {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		System.out.println("The sum of digits of number "+number+" is "+getSumOfDigits(number));
	}
	
	public static int getSumOfDigits(int number){
		int sum = 0, rem;
		while(number >0){
			rem = number%10;
			sum += rem;
			number /= 10;
		}
		return sum;
	}

}
