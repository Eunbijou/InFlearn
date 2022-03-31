package pjtTest;

public abstract class FiftyEighthClass {

	int num;
	String str;
	
	public FiftyEighthClass() {
		System.out.println("AbstractClassEx constructor");
		
	}
	
	public FiftyEighthClass(int i, String s) {
		System.out.println("AbstractClassEx constructor");
		
		this.num = i;
		this.str = s;
		
	}
	
	public void fun1() {
		System.out.println("-- fun1() Start --");
	}
	
	public abstract void fun2();
	
}
