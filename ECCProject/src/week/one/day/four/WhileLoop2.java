package week.one.day.four;

public class WhileLoop2 {
	public static void main(String[] args) {
		int maxNum = Integer.parseInt(args[0]);
		System.out.println("Sum of all numbers until " + maxNum + " is " + getSumOfNumbers(maxNum));
	}

	public static int getSumOfNumbers(int maxNum) {
		int i = 1, sum = 0;
		while (i <= maxNum)
			sum += i++;
		return sum;
	}

}
