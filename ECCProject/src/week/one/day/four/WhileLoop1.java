package week.one.day.four;

public class WhileLoop1 {

	public static String implementWhileLoop(int noOfTimes) {
		int x = 1, sum = 0;
		String result = "";
		while (x <= noOfTimes) {
			result += x;
			result += "\n";
			sum += x++;

		}
		result = result + "Sum = " + sum;
		return result;
	}

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		System.out.println(implementWhileLoop(num));
	}

}
