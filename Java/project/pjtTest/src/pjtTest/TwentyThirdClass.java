package pjtTest;

import java.util.Scanner;

public class TwentyThirdClass {

	public static void main(String[] args) {
		
		// switch��
		System.out.print("������ �Է��ϼ���. : ");
		Scanner inputNum = new Scanner(System.in);
		int score = inputNum.nextInt();
		
		switch(score) {
			case 100:
			case 90:
				System.out.println("��");
			break;
			
			case 80:
				System.out.println("��");
			break;
			
			case 70:
				System.out.println("��");
			break;
			
			default:
				System.out.println("try again!!");
			break;
		}
		
		inputNum.close();
		
	}
}
