package pjtTest;

public class FortiethClass {

	public static void main(String[] args) {
		
		// 디폴트 생성자
		FortiethFirstClass obj1 = new FortiethFirstClass();
		
		System.out.println();
		
		// 사용자 정의 생성자
		FortiethFirstClass obj2 = new FortiethFirstClass(10);
		
		int arr[] = {10, 20, 30};
		FortiethFirstClass obj3 = new FortiethFirstClass("Java", arr);
		
		// 소멸자
		FortiethFirstClass obj4;
		
		obj4 = new FortiethFirstClass();
		obj4 = new FortiethFirstClass();
		
		// this 키워드
		int ints[] = {10, 20, 30};
		FortiethFirstClass obj5 = new FortiethFirstClass(10, "Java", ints);
		
	}
}
