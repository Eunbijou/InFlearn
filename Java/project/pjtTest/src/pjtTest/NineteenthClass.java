package pjtTest;

import java.util.Scanner;

public class NineteenthClass {

	public static void main(String[] args) {
		
		// �迭�� �̿��� �л� ����
		String[] name = {"����ȣ", "�̽¿�", "�ں�ȣ", "�̺���", "������"};
		int[] score = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.printf("%s�� ������ �̷��Ͻÿ�. : ", name[0]);
		score[0] = scanner.nextInt();
		
		System.out.printf("%s�� ������ �̷��Ͻÿ�. : ", name[1]);
		score[1] = scanner.nextInt();
		
		System.out.printf("%s�� ������ �̷��Ͻÿ�. : ", name[2]);
		score[2] = scanner.nextInt();
		
		System.out.printf("%s�� ������ �̷��Ͻÿ�. : ", name[3]);
		score[3] = scanner.nextInt();
		
		System.out.printf("%s�� ������ �̷��Ͻÿ�. : ", name[4]);
		score[4] = scanner.nextInt();
		
		System.out.printf("%s ���� : \t%.2f\n", name[0], (double)score[0]);
		System.out.printf("%s ���� : \t%.2f\n", name[1], (double)score[1]);
		System.out.printf("%s ���� : \t%.2f\n", name[2], (double)score[2]);
		System.out.printf("%s ���� : \t%.2f\n", name[3], (double)score[3]);
		System.out.printf("%s ���� : \t%.2f\n", name[4], (double)score[4]);
		
		double ave = (double)(score[0] + score[1] + score[2] + score[3] + score[4]) / 5;
		System.out.printf("-----------------------\n�� �� : \t%.2f", ave);
		
		scanner.close();
		
	}
}
