package pjtTest;

public class FortySeventhClass {
	
	public static void main(String[] args) {
		
		FortyEgihthClass outerClass = new FortyEgihthClass();
		System.out.println("oc.num : " + outerClass.num);
		System.out.println("oc.str1 : " + outerClass.str1);
		
		System.out.println();
		
		// 멤버 inner 클래스
		FortyEgihthClass.InnerClass innerClass = outerClass.new InnerClass();
		System.out.println("in.num : " + innerClass.num);
		System.out.println("in.str2 : " + innerClass.str2);
		
		System.out.println();
		
		// static inner 클래스
		FortyEgihthClass.SInnerClass sinnerClass = new FortyEgihthClass.SInnerClass();
		System.out.println("si.num : " + sinnerClass.num);
		System.out.println("si.str3 : " + sinnerClass.str3);
		
		System.out.println();
		
		// 익명 클래스
		new FortyNinthClass() {
			
			@Override
			public void method() {
				System.out.println(" -- AnonymousClass's Override method START -- ");
			};
		}.method();
		
	}

}
