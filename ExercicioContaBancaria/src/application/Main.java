package application;

import java.util.Scanner;

import entities.BankAccount;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account number:");
		String numberAccount = sc.nextLine();
		
		System.out.println("Enter account holder:");
		String holderAccount = sc.nextLine();
		
		System.out.println("Is there a initial deposit (y/n)?");
		char yesOrNot = sc.next().charAt(0);
		
		double depositValue = 0;
		
		if (yesOrNot == 'y') {
			System.out.print("Enter initial deposit value:");
			depositValue = sc.nextDouble();
			}
	
		BankAccount bankAccount = (yesOrNot == 'y') ?
				               new BankAccount(numberAccount, holderAccount, depositValue) 
				               : new BankAccount(numberAccount, holderAccount);
		System.out.println(bankAccount);
		
		System.out.println("Enter a deposit value:");
		bankAccount.deposit(sc.nextDouble());
		System.out.println(bankAccount);
		
		System.out.println("Enter a withdraw value:");
		bankAccount.withdraw(sc.nextDouble());
		System.out.println(bankAccount);
		
		sc.close();
	}

}
