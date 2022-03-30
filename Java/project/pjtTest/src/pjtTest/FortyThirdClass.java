package pjtTest;

public class FortyThirdClass {
	
	public int x;
	public int y;

	public FortyThirdClass(String s, int[] iArr) {
		
		System.out.println("-- FortyThirdClass() --");
		
		System.out.println("s -----> " + s);
		System.out.println("iArr -----> " + iArr);
		
	}
	
	public FortyThirdClass(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	public void getInfo() {

		System.out.println("x -----> " + x);
		System.out.println("y -----> " + y);

	}
}
