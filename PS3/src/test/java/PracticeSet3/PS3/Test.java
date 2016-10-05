package PracticeSet3.PS3;

public class Test {

	public static void main(String[] args) throws InsufficientFundsException, WrongDepositException {
		
		Account bigMoney = new Account(1122, 20000);
		bigMoney.setAnnualInterestRate(4.5);
		bigMoney.withdraw(2500);
		bigMoney.deposit(3000);
		bigMoney.getBalance();
		
		System.out.printf("The account balance is $%.2f", bigMoney.getBalance());
		System.out.printf("%nThe monthly interest rate is %2.3f%%", bigMoney.getMonthlyInterestRate());
		System.out.println("\n" + "This account was created on " + bigMoney.getDateCreated());
	}
}