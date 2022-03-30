package pjtTest;

public class FortyFirstClass {

	int num;
	String str;
	int nums[];
	
	public FortyFirstClass() {
		
		System.out.println("Default constructor");
		
	}
	
	public FortyFirstClass(int i) {
		
		System.out.println("Custom constructor");
		num = i;
		
	}
	
	public FortyFirstClass(String s, int i[]) {
		
		System.out.println("UserDefined constructor");
		str = s;
		nums = i;
		
	}
	
	public FortyFirstClass(int i, String s, int is[]) {
		
		System.out.println("UserDefined constructor");
		
		this.num = i;
		this.str = s;
		this.nums = is;
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("-- dinalize() method --");
		
		super.finalize();
		
	}
}
