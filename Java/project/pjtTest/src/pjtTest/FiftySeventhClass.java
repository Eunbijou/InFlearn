package pjtTest;

public class FiftySeventhClass {

	public static void main(String[] args) {
		
		FiftyFourthClass robot = new FiftySixthClass();
		FiftyFourthClass airplane = new FiftyFifthClass();
		
		FiftyFourthClass toys[] = {robot, airplane};
		
		for (int i = 0; i < toys.length; i++) {
			toys[i].walk();
			toys[i].run();
			toys[i].alarm();
			toys[i].light();
			
			System.out.println();
		}
	}
}
