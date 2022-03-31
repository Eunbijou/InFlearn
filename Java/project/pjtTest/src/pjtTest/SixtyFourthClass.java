package pjtTest;

public class SixtyFourthClass {

	public static void main(String[] args) {
		
		// �Ű������� ���๮������ �ۼ��Ѵ�. (������, ��ȯ��, return Ű���� ����)
		SixtyFifthClass li1 = (String s1, String s2, String s3) -> { System.out.println(s1 + " " + s2 + " " + s3); };
		li1.method("Hello", "java", "world");
		
		System.out.println();
		
		// �Ű������� 1���̰ų� Ÿ���� ���� ��, Ÿ���� ������ �� �ִ�.
		SixtySixthClass li2 = (s1) -> { System.out.println(s1); };
		li2.method("Hello");
		
		// ���๮�� 1���� ��, '{}'�� ������ �� �ִ�.
		SixtySixthClass li3 = (s1) -> System.out.println(s1);
		li3.method("Hello");
		
		// �Ű������� ���๮�� 1���� ��, '()'�� '{}'�� ������ �� �ִ�.
		SixtySixthClass li4 = s1 -> System.out.println(s1);
		li4.method("Hello");
		
		// �Ű������� ���� ��, '()'�� �ۼ��Ѵ�.
		SixtySeventhClass li5 = () -> System.out.println("no parameter");
		li5.method();
		
		// ��ȯ���� �ִ� ���
		SixtyEighthClass li6 = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.printf("li6.method(10, 20) : %d\n", li6.method(10, 20));
		
		li6 = (x, y) -> {
			int result = x * y;
			return result;
		};
		System.out.printf("li6.method(10, 20) : %d\n", li6.method(10, 20));
		
		li6 = (x, y) -> {
			int result = x - y;
			return result;
		};
		System.out.printf("li6.method(10, 20) : %d\n", li6.method(10, 20));
		
	}
}
