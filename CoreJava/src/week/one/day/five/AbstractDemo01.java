package week.one.day.five;

abstract class Maths {
	
	abstract public void sum(int x, int y);

	public void sub(int x, int y) {
		System.out.println("The difference is : " + (x - y));
	}

	public void mul(int i, int j) {}
}

class Calculate extends Maths {

	@Override
	public void sum(int x, int y) {
		System.out.println("The sum is : " + (x + y));
	}

	public void mul(int x, int y) {
		System.out.println("The product is : " + (x * y));
	}

}

public class AbstractDemo01 {

	public static void main(String[] args) {
		Calculate calculate = new Calculate();
		calculate.sum(30, 10);
		calculate.sub(30, 10);
		calculate.mul(30, 10);
		Maths maths = new Calculate();
		maths.sum(20, 10);
		maths.sub(20, 10);
		maths.mul(20, 10);
	}

}
