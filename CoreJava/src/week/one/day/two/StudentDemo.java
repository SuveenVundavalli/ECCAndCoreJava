package week.one.day.two;

public class StudentDemo {

	public static void main(String[] args) {
		Student studentOne = new Student("Suveen Kumar", "Vundavalli", "suveenkumar.vundavalli@gmail.com", "C01", "8686242020", 45000);
		System.out.println(studentOne);
		Student studentTwo = new Student("Tirupathi", "Reddygari Gopal", "reddygari.gopal@gmail.com", "C01", "9491766718", 43000);
		System.out.println(studentTwo);
		studentTwo.setFirstName("Tirupathi Reddy");
		System.out.println(studentTwo);
		System.out.println(studentTwo.getFirstName());
		Student studentThree = new Student();
		System.out.println(studentThree);
	}

}
