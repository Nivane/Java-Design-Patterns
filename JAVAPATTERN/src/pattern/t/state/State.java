package pattern.t.state;

public abstract class State {
	protected Account account;
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	protected int balance;
	private static int lowerLimit;
	private static int upperLimit;

	public int getBalance() {
		return balance;
	}

	public int getLowerLimit() {
		return lowerLimit;
	}

	public int getUpperLimit() {
		return upperLimit;
	}

	abstract void deposit(int amount);

	abstract void withdraw(int amount);

	abstract void checkState();

}
