package week.two.day.six;

interface Sum{
	void sum(int a, int b);
}

interface Mul{
	void mul(int a, int b);
}

class Maths implements Sum, Mul{

	@Override
	public void mul(int a, int b) {
		System.out.println("Mul : "+(a*b));
	}

	@Override
	public void sum(int a, int b) {
		System.out.println("Sum : "+(a+b));
		}}


public class InterfaceDemo2 {

	public static void main(String[] args) {
		Maths maths = new Maths();
		maths.mul(10, 20);
		maths.sum(10, 20);
	}

}
