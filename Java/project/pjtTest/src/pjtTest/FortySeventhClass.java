package pjtTest;

public class FortySeventhClass {
	
	public static void main(String[] args) {
		
		FortyEgihthClass outerClass = new FortyEgihthClass();
		System.out.println("oc.num : " + outerClass.num);
		System.out.println("oc.str1 : " + outerClass.str1);
		
		System.out.println();
		
		// ��� inner Ŭ����
		FortyEgihthClass.InnerClass innerClass = outerClass.new InnerClass();
		System.out.println("in.num : " + innerClass.num);
		System.out.println("in.str2 : " + innerClass.str2);
		
		System.out.println();
		
		// static inner Ŭ����
		FortyEgihthClass.SInnerClass sinnerClass = new FortyEgihthClass.SInnerClass();
		System.out.println("si.num : " + sinnerClass.num);
		System.out.println("si.str3 : " + sinnerClass.str3);
		
		System.out.println();
		
		// �͸� Ŭ����
		new FortyNinthClass() {
			
			@Override
			public void method() {
				System.out.println(" -- AnonymousClass's Override method START -- ");
			};
		}.method();
		
	}

}
