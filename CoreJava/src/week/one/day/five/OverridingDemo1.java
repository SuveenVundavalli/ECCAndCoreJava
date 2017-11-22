package week.one.day.five;


class Parent {
	public void show() {
		System.out.println("This is parent show method");
	}
}

class Child extends Parent {
	@Override
	public void show() {
		System.out.println("This is child show method");
	}
}


public class OverridingDemo1 {
	public static void main(String[] args) {
		Child child = new Child();
		child.show();
	}

}
