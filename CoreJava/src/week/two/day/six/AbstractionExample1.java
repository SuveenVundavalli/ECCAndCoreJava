package week.two.day.six;

abstract class CellPhone{
	abstract void call();
	abstract void message();
	public void increaseVolume(){
		System.out.println("Volume increased!");
	}
	public void decreaseVolume(){
		System.out.println("Volume decreased!");
	}
	public void takePicture(){
		System.out.println("Picture taken!");
	}
	
}

class Airtel extends CellPhone{

	@Override
	void call() {
		System.out.println("Calling from airtel");
	}

	@Override
	void message() {
		System.out.println("Message sent from airtel");
	}
	
}
class Idea extends CellPhone{
	
	@Override
	void call() {
		System.out.println("Calling from idea");
	}
	
	@Override
	void message() {
		System.out.println("Message sent from idea");
	}
	
}


public class AbstractionExample1 {

	public static void main(String[] args) {
		CellPhone cellPhone = null;
		cellPhone = new Airtel();
		cellPhone.call();
		cellPhone.message();
		cellPhone.takePicture();
		cellPhone.increaseVolume();
		cellPhone.decreaseVolume();
		System.out.println();
		cellPhone = new Idea();
		cellPhone.call();
		cellPhone.message();
		cellPhone.takePicture();
		cellPhone.increaseVolume();
		cellPhone.decreaseVolume();
	}

}
