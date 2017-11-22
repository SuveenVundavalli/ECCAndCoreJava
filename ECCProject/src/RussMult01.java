public class RussMult01 {
	public static void main(String[] args) {
		int n1 = 25475;
		int n2 = 35655;
		System.out.println(getProduct(27, 35));
	}

	public static String getProduct(int num1, int num2) {
		if(num1 <=0 || num2 <=0)
			return "-1";
		if(num1 >=100000 || num2 >= 100000)
			return "-2";
		int sum = 0, oddOrEven = 0;
		String output = "";
		while (num1 > 0) {
			oddOrEven = num1 % 2;

			if (oddOrEven == 1) {
				sum += num2;
					output = output+num2;
					if (num1 != 1){
						output += "+";
					}
						

			}
			num1 /= 2;
			num2 *= 2;

		}
		output=output+" = "+sum;
		return output;
	}
}