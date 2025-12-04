package OOP_Encapsulation_Assignments_2;

public class BankAccount {

	private String accountNumber;
	private double balance;
	private String owner;
	
	public BankAccount(String accountNumber,double balance,String owner) {
		this.accountNumber=accountNumber;
		this.balance=balance;
		this.owner=owner;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public double depositinAccount (double balance) {
		double deposit = 100.0+balance;
		return deposit;
	}
	
	public double withdrawinAccount (double balance) {
		double withdraw = 100.0-balance;
		return withdraw;
	}
	
	
	public void printStatement () {
		System.out.println(accountNumber + " " +  balance + " " + accountNumber);
		
	} 
	
	
	
}
