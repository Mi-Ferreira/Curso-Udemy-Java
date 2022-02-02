package entities;

public class BankAccount {
	
	private String numberAccount;
	private String holderAccount;
	private double balance;
	
	public BankAccount(String numberAccount, String holderAccount, double InitialValue) {
		this.numberAccount = numberAccount;
		this.holderAccount = holderAccount;
		deposit (InitialValue);
	}

	public BankAccount(String numberAccount, String holderAccount) {
		this.numberAccount = numberAccount;
		this.holderAccount = holderAccount;
	}

	public String getNumberAccount() {
		return numberAccount;
	}

	public String getHolderAccount() {
		return holderAccount;
	}

	public void setHolderAccount(String holderAccount) {
		this.holderAccount = holderAccount;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit (double balance) {
		this.balance += balance;
	}
	
	public void withdraw (double balance) {
		this.balance -= (balance + 5);
	}
	
	public String toString() {
		return "Updated account data: \n"
	    + "Number Account: " + getNumberAccount() + "\n" 
	    + "Holder Account: " + getHolderAccount() + "\n"
	    + "Balance: " + String.format("%.2f", getBalance());
	}

}
