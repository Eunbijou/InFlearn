package pjtTest;

public class TwentySecondClass {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		// if(조건식)
		if(num1 < num2) {
			System.out.println("num1는 num2보다 작다.");
		}
		
		System.out.println();
		
		// if(조건식) else
		if(num1 < num2) {
			System.out.println("num1는 num2보다 작다.");
		} else {
			System.out.println("num1는 num2보다 크거나 같다.");
		}
		
		System.out.println();
		
		// if(조건식) else if(조건식)
		if(num1 < num2) {
			System.out.println("num1는 num2보다 작다.");
		} else if(num1 > num2) {
			System.out.println("num1는 num2보다 크다.");
		} else {
			System.out.println("num1과 num2는 같다.");
		}
		
	}
}
