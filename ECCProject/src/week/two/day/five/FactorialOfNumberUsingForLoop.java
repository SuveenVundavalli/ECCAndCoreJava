package week.two.day.five;

public class FactorialOfNumberUsingForLoop {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		System.out.println("The factorial of number "+number+" is "+getFactorialOfNumber(number));
	}

	public static int getFactorialOfNumber(int number) {
		int result=1;
		for(int i=number; i>0; i--){
			result*=i;
		}
		return result;
	}

}
