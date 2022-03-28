package pjtTest;

public class FortiethThirdClass {
	
	public int x;
	public int y;

	public FortiethThirdClass(String s, int[] iArr) {
		
		System.out.println("-- FortiethThirdClass() --");
		
		System.out.println("s -----> " + s);
		System.out.println("iArr -----> " + iArr);
		
	}
	
	public FortiethThirdClass(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	public void getInfo() {

		System.out.println("x -----> " + x);
		System.out.println("y -----> " + y);

	}
}
