package com.ds.example.book;

class BankAccount {
	private double balance;

	public BankAccount(double openingBalance) {
		balance = openingBalance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (balance >= amount)
			balance -= amount;
		else
			System.out.println("Insufficient balance");
	}

	public void displayBalance() {
		System.out.println("Balance : " + balance);
	}
}

public class BankAccountMain {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000);
		account.displayBalance();
		account.deposit(5000);
		account.displayBalance();
		account.withdraw(2000);
		account.displayBalance();
	}
}
