package week.two.day.six;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		try {
			int c = a / b;
			System.out.println("The division is : " + c);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("ArithmeticException Handled");
		
		try {
			int d = Integer.parseInt(args[2]);
			System.out.println("D varible is : "+d);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("NumberFormatException Handled");

		try {
			int d = Integer.parseInt(args[3]);
			System.out.println("D varible is : "+d);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("ArrayIndexOutOfBoundsException Handled");
		
		
		
	}

}
