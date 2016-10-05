package PracticeSet3.PS3;

public class InsufficientFundsException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private double necessaryFunds;
	
	public InsufficientFundsException(double necessaryFunds) {
		this.necessaryFunds = necessaryFunds;
		System.out.printf("Account needs $%.2f", necessaryFunds);
		System.out.println("\n");
	}
	
	public double getNecessaryFunds() {
		return necessaryFunds;
	}

}