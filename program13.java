package programs;

public class program13 {
	private double balance;
	 public void Account(double initialBalance) {
	 if (initialBalance > 0.0) balance=initialBalance;
	 }

	 public void credit(double amount){
	 balance=balance+amount;
	 }

	 public void debit(double amount){
	 balance=balance-amount;

	 }

	 public double getBalance(){
	 return balance;
	 }
	}

