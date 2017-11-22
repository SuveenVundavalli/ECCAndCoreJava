package week.two.day.six;

public class MultiplicationTables {

	public static void main(String[] args) {
		System.out.println(getMultiplicationTables());
	}

	public static String getMultiplicationTables() {
		String output = "";
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i < 10 && j < 10) {
					if((i*j)<10)
						output += " " + i + " x  " + j + " =  " + (i * j);
					else
						output += " " + i + " x  " + j + " = " + (i * j);
					output += "\n";
				} else if (i < 10 && j == 10) {
					if((i*j)<10)
						output += " " + i + " x " + j + " =  " + (i * j);
					else
						output += " " + i + " x " + j + " = " + (i * j);
					output += "\n";
				} else if (i == 10 && j < 10) {
					if((i*j)<10)
						output += i + " x  " + j + " =  " + (i * j);
					else
						output += i + " x  " + j + " = " + (i * j);
					output += "\n";

				} else if (i == 10 && j == 10) {
					if((i*j)<10)
						output += i + " x " + j + " =  " + (i * j);
					else
						output += i + " x " + j + " = " + (i * j);
					output += "\n";
				}

			}
			output += "\n";

		}
		return output;

	}
}
