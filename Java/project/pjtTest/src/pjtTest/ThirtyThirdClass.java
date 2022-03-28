package pjtTest;

public class ThirtyThirdClass {

	public String name;
	public String gender;
	public int age;
	
	public ThirtyThirdClass() {
		System.out.println("-- ThirtyThirdClass constructor --");
		
	}
	
	public void setInfo(String n, String g, int a) {
		System.out.println("-- setInfo() --");
		
		name = n;
		gender = g;
		age = a;
		
	}
	
	public void getInfo() {
		System.out.println("-- getInfo() --");
		
		System.out.println(" name : " + name);
		System.out.println(" gender : " + gender);
		System.out.println(" age : " + age);
		
	}
}
