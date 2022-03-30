package pjtTest;

public class FiftyFirstClass implements FiftySecondClass, FiftyThirdClass {

	public FiftyFirstClass() {
		System.out.println("-- FiftyFirstClass constructoer --");
		
	}
	
	@Override
	public void funA() {
		System.out.println("-- funA() --");
		
	}
	
	@Override
	public void funB() {
		System.out.println("-- funB() --");
		
	}	
}
