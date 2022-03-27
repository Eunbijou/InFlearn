package pjtTest;

import java.util.Scanner;

public class TwentyThirdClass {

	public static void main(String[] args) {
		
		// switch문
		System.out.print("점수를 입력하세요. : ");
		Scanner inputNum = new Scanner(System.in);
		int score = inputNum.nextInt();
		
		switch(score) {
			case 100:
			case 90:
				System.out.println("수");
			break;
			
			case 80:
				System.out.println("우");
			break;
			
			case 70:
				System.out.println("미");
			break;
			
			default:
				System.out.println("try again!!");
			break;
		}
		
		inputNum.close();
		
	}
}
