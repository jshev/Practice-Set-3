package PracticeSet3.PS3;

public class WrongDepositException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public WrongDepositException() {
		System.out.print("Deposit must be positive.");
		System.out.println("\n");
	}
}