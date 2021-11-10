package Exception10.custom_Exception.p444;

public class Account {

	private long balance;
	
	public Account() {}
	
	public long getBalnace() {
		return balance;
	}
	public void deposit(int money) {
		balance +=money;
	}
	public void withdraw(int money) throws BalanceInsufficientException{
		if(balance < money) {
			throw new BalanceInsufficientException("잔고부족 :"+(money-balance)+" 모자람");
		}
		balance -= money;
	}
}
