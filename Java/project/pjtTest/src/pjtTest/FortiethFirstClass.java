package pjtTest;

public class FortiethFirstClass {

	int num;
	String str;
	int nums[];
	
	public FortiethFirstClass() {
		
		System.out.println("Default constructor");
		
	}
	
	public FortiethFirstClass(int i) {
		
		System.out.println("Custom constructor");
		num = i;
		
	}
	
	public FortiethFirstClass(String s, int i[]) {
		
		System.out.println("UserDefined constructor");
		str = s;
		nums = i;
		
	}
	
	public FortiethFirstClass(int i, String s, int is[]) {
		
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
