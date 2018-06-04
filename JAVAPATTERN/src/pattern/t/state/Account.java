package pattern.t.state;

public class Account {
	
	public State state;
	
	public Account() {
		this.state = new SilverState(this);
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void deposit(int amount) {
		this.state.deposit(amount);
		System.out.println("-----------------------------------");
		System.out.println(this.state.getClass().getSimpleName());
		System.out.println("Deposit: " + amount);
		System.out.println("Balance: " + this.state.getBalance());
	}
	
	public void withdraw(int amount) {
		this.state.withdraw(amount);
		System.out.println("-----------------------------------");
		System.out.println(this.state.getClass().getSimpleName());
		System.out.println("Withdraw: " + amount);
		System.out.println("Balance: " + this.state.getBalance());
	}
	
	
}
