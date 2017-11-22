public class Collatz01 {
	public static void main(String[] args) {
		System.out.println(getCollatzSequence(5));
	}

	public static String getCollatzSequence(int number) {
		if(number <=0)
			return "Error";
		if(number == 2)
			return "2 1 4 2 1";
		if(number == 1)
			return "1 4 2 1";
		int counter=0;
		String output = number + " ";
		while (number > 2) {
			counter ++;
			if(counter >=100)
				return "Does not Converge";

			if (number % 2 == 0) {
				number /= 2;

			} else {
				number = (number * 3) + 1;
			}
			if (number != 1)
				output += number + " ";
			else
				output += number;
		}
		// output+="1";
		
		return output;

	}
}
