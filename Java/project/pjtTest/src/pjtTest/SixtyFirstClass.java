package pjtTest;

public class SixtyFirstClass {

	public static void main(String[] args) {
		
		SixtySecondClass myBank = new SixtyThirdClass("����ȣ", "123-4567-89012", 10000);
		
		myBank.deposit();	// ����
		myBank.withdraw();	// ���
		myBank.installmentSavings();	// ����
		myBank.cancellation();	// �ؾ�
		
		System.out.println();
		
		myBank.getInfo();
		
	}
}
