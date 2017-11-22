package week.one.day.four;

class Maths {
	public void sum(int a, int b) {
		System.out.println("Sum = " + (a + b));
	}

	public void sum(double a, double b) {
		System.out.println("Sum = " +(a + b));
	}

	public void sum(int a, int b, int c) {
		System.out.println("Sum = " + (a + b + c));
	}
}

public class OverloadingDemo {

	public static void main(String[] args) {
		Maths maths = new Maths();
		maths.sum(20, 8);
		maths.sum(20.1, 8);
		maths.sum(2, 3, 4);
	}

}
