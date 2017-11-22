package week.two.day.six;

interface Shape {
	void draw();
}

class Rectangle implements Shape {
	
	public void draw() {
		System.out.println("Rectangle Draw");
	}
}

class Triangle implements Shape {
	
	public void draw() {
		System.out.println("Triangle Draw");
	}
}

public class InterfaceDemo1 {
	public static void main(String[] args) {
		Shape shape = null;
		shape = new Rectangle();
		shape.draw();
		shape = new Triangle();
		shape.draw();
	}
}
