package pjtTest;

import java.util.Arrays;

public class TwentiethClass {

	public static void main(String[] args) {
		
		// �迭 �⺻ �Ӽ�
		int[] arrAtt1 = {10, 20, 30, 40, 50, 60};
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;
		
		// �迭 ����
		System.out.println("arrAtt1.length : " + arrAtt1.length);
		
		// �迭 ��� ���
		System.out.println("arrAtt1 : " + Arrays.toString(arrAtt1));
		
		// �迭 ��� ����
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
		System.out.println("arrAtt3 : " + Arrays.toString(arrAtt3));
		
		// �迭 ���۷���
		arrAtt2 = arrAtt1;
		System.out.println("arrAtt1 : " + arrAtt1);
		System.out.println("arrAtt2 : " + arrAtt2);
		System.out.println("arrAtt3 : " + arrAtt3);
		
	}
}
