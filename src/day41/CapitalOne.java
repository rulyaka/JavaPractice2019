package day41;

public class CapitalOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bank = new BankAccount();
		bank.accountHolder = "Joe";
		bank.accountNum = 123213213;

		bank.deposit(123);
		bank.withdraw(76);
		bank.showBalance();
        
		bank.charge(12, "gums");
	
		bank.showBalance();
	}

}
