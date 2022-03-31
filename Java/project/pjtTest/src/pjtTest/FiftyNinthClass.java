package pjtTest;

public class FiftyNinthClass extends FiftyEighthClass {

	public FiftyNinthClass() {
		System.out.println("ClassEx constructor");
		
	}
	
	public FiftyNinthClass(int i, String s) {
		super(i, s);
		
	}
	
	@Override
	public void fun2() {
		System.out.println("-- fun2() Start --");
		
	}
}
