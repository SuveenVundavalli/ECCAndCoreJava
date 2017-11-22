package week.one.day.one;

class Sample {
	private int x, y;
	
	public void read(int x, int y) {
		//this keyword refers to variable which holds the address of the current object
		this.x = x;
		this.y = y;
	}

	void print() {
		System.out.println("The value of X : " + x);
		System.out.println("The value of Y : " + y);
	}

	public void sum() {
		System.out.println("The sum is : " + (x + y));
	}
}

public class ClassDemo01 {

	public static void main(String[] args) {
		Sample obj1 = new Sample();
		obj1.read(10, 20);
		obj1.print();
		obj1.sum();

		Sample obj2 = new Sample();
		obj2.read(100, 200);
		obj2.print();
		obj2.sum();
		
	}

}
