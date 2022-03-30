package pjtTest;

public class FortiethClass {

	public static void main(String[] args) {
		
		// 디폴트 생성자
		FortyFirstClass obj1 = new FortyFirstClass();
		
		System.out.println();
		
		// 사용자 정의 생성자
		FortyFirstClass obj2 = new FortyFirstClass(10);
		
		int arr[] = {10, 20, 30};
		FortyFirstClass obj3 = new FortyFirstClass("Java", arr);
		
		// 소멸자
		FortiyFirstClass obj4;
		
		obj4 = new FortyFirstClass();
		obj4 = new FortyFirstClass();
		
		// this 키워드
		int ints[] = {10, 20, 30};
		FortyFirstClass obj5 = new FortyFirstClass(10, "Java", ints);
		
	}
}
