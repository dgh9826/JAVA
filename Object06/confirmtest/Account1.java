package Object06.confirmtest;

public class Account1 {

	private int balance;
	private int MIN_BALANCE=0;
	private int MAX_BALANCE=1000000;
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance>MIN_BALANCE&&balance<MAX_BALANCE) {
			this.balance = balance;
		}
	}
	
}
