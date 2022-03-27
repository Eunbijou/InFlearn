package pjtTest;

public class TwentySeventhClass {

	public static void main(String[] args) {
		
		Grandeur2 myCar1 = new Grandeur2();
		myCar1.color = "red";
		myCar1.gear = "auto";
		myCar1.price = 30000000;
		
		myCar1.run();
		myCar1.stop();
		myCar1.info();
		
		System.out.println();
		
		Grandeur2 myCar2 = new Grandeur2();
		myCar2.color = "blue";
		myCar2.gear = "manual";
		myCar2.price = 25000000;
		
		myCar2.run();
		myCar2.stop();
		myCar2.info();
		
	}
}
