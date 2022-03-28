package pjtTest;

public class ThirtyFourthClass {

	public static void main(String[] args) {
		
		ThirtyFifthClass obj1 = new ThirtyFifthClass();
		ThirtyFifthClass obj2 = new ThirtyFifthClass();

		obj1.getInfo();
		
		obj1 = null;	// 레퍼런스x
		//obj1.getInfo();
		
		obj2.getInfo();
		
	}
}
