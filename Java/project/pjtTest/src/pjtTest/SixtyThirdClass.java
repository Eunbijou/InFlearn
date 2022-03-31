package pjtTest;

public class SixtyThirdClass extends SixtySecondClass {

	public SixtyThirdClass(String name, String account, int totalAmount) {
		super(name, account, totalAmount);
		
	}
	
	@Override
	public void installmentSavings() {
		System.out.println("-- installmentSavings() Start --");
	}
	
	@Override
	public void cancellation() {
		System.out.println("-- cancellatrion() Start --");
	}
}
