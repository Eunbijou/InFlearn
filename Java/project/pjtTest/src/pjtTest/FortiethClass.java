package pjtTest;

public class FortiethClass {

	public static void main(String[] args) {
		
		// ����Ʈ ������
		FortiethFirstClass obj1 = new FortiethFirstClass();
		
		System.out.println();
		
		// ����� ���� ������
		FortiethFirstClass obj2 = new FortiethFirstClass(10);
		
		int arr[] = {10, 20, 30};
		FortiethFirstClass obj3 = new FortiethFirstClass("Java", arr);
		
		// �Ҹ���
		FortiethFirstClass obj4;
		
		obj4 = new FortiethFirstClass();
		obj4 = new FortiethFirstClass();
		
		// this Ű����
		int ints[] = {10, 20, 30};
		FortiethFirstClass obj5 = new FortiethFirstClass(10, "Java", ints);
		
	}
}
