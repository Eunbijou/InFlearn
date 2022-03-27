package pjtTest;

import java.util.Scanner;

public class TwentyFourthClass {

	public static void main(String[] args) {
		
		// for¹®
		System.out.print("INPUT NUMBER : ");
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", inputNum, i, (inputNum * i));
		
		}
	}
}
