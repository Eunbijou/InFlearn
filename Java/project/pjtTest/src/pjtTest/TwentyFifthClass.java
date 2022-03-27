package pjtTest;

import java.util.Scanner;

public class TwentyFifthClass {

	public static void main(String[] args) {
		
		// while¹®
		System.out.print("INPUT NUMBER : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int i = 1;
		while (i < 10) {
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
			i++;
			
		}
	}
}
