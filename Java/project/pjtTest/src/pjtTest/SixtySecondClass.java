package pjtTest;

public abstract class SixtySecondClass {

	String name;
	String account;
	int totalAmount;
	
	public SixtySecondClass() {
		System.out.println("Bank constructor");
		
	}
	
	public SixtySecondClass(String name, String account, int totalAmount) {
		System.out.println("Bank constructor");
		
		this.name = name;
		this.account = account;
		this.totalAmount = totalAmount;
	}
	
	// ����
	public void deposit() {
		System.out.println("-- deposit() Start --");
		
	}
	
	// ���
	public void withdraw() {
		System.out.println("-- withdraw() Start --");
		
	}
	
	// ����
	public abstract void installmentSavings();
	
	//�ؾ�
	public abstract void cancellation();
	
	// �������
	public void getInfo() {
		System.out.printf("name : %s\n", name);
		System.out.printf("account : %s\n", account);
		System.out.printf("totalAmount : %d\n", totalAmount);
	}
}
