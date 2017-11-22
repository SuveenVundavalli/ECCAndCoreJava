package week.two.day.five;

public class MultiplicationTableUsingForLoop {

	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);

		System.out.println(getTable(number));
	}

	public static String getTable(int number) { 
		String output = "";
		for (int i = 1; i <= 10; i++) {
			output += number + " x " + i + " = " + (i * number);
			if(i!=10)
				output += "\n";
		}
		return output;
	}

}
