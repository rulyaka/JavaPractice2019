package day41;

public class BankAccount {
	double balance;
	String accountHolder;
	int accountNum;
	
	
	public void deposit(double amount) {
		System.out.println("depositing$ "+amount+ " to "+accountNum);
		balance+=amount;
		
	}
	public void withdraw(int amount) {
		System.out.println("withdrawing "+amount+" from"+ accountNum);
		balance-=amount;
		if(balance<0) {
			balance-=35;
		}
	}
	public void showBalance() {
		System.out.println("accountHolder: "+accountHolder);
		System.out.println("accountNum: "+accountNum);
		System.out.println("balance: "+balance);


	}
	public void charge(double price, String item) {
		
		if(balance>=price) {
		System.out.println("buying "+item+" for$ "+price+" from "+accountNum);
		
		balance-=price;
	}else {
		System.out.println("insuficient funds "+item);
	}
	}
}
