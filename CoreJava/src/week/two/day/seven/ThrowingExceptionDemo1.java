package week.two.day.seven;

/*
 * If class extends throwable class except RuntimeException and error is called checked exception. They are checked at compile time and if unhandled gives error.
 * A class extending RuntimeException is called uncatched exception. They are not checked at compile time.
 */

class AgeException extends RuntimeException {
	
	public String toString() {
		return "Invalid Age Exception";
	}
}

class Person {
	String name;
	int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		if (age <= 0)
			try {
				throw new AgeException();
			} catch (AgeException e) {
				e.printStackTrace();
			}
		else {
			this.name = name;
			this.age = age;
		}
	}

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}

}

public class ThrowingExceptionDemo1 {

	public static void main(String[] args) {
		Person personOne = new Person("Suveen", 23);
		personOne.display();

		Person personTwo = new Person("Suveen", -23);
		personTwo.display();

	}

}
