package week.one.day.three;

class Parent {
	protected int x, y;

	public Parent() {
		super();
		System.out.println("Hi! I am parent class constructor");
	}

	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println(this.x + " " + this.y);
	}

	public void showParent() {
		System.out.println("Hi! I am parent class method");
	}

}

class Child extends Parent {
	private int z;


	public Child() {
		super();
		System.out.println("Hi! I am child class constructor");
	}

	public Child(int x, int y, int z) {
		super(x, y);
		this.z = z;
		System.out.println(this.z);
	}

	public void showChild() {
		System.out.println("Hi! I am child class method");
	}

	public void getSum() {
		System.out.println("" + x + "+" + y + "+" + z + "=" + (x + y + z));
	}

}

public class InheritanceDemo01 {

	public static void main(String[] args) {
		Child child = new Child(1, 2, 3);
		child.showParent();
		child.showChild();
		child.getSum();
		Child child1 = new Child(10, 20, 30);
		child1.showParent();
		child1.showChild();
		child1.getSum();

	}

}
