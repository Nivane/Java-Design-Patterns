package pattern.t.state;

public class SilverState extends State {

	private static int lowerLimit = 0;
	private static int upperLimit = 10000;
	
	public SilverState(State state) {
		this.balance = state.getBalance();
		this.account = state.getAccount();
	}
	
	public SilverState(Account account) {
		this.balance = 0;
		this.account = account;
	}

	@Override
	void deposit(int amount) {
		// TODO Auto-generated method stub
		this.balance += amount;
		checkState();
	}

	@Override
	void withdraw(int amount) {
		// TODO Auto-generated method stub
		this.balance -= amount;
		checkState();
	}

	@Override
	void checkState() {
		// TODO Auto-generated method stub
		if (this.balance < SilverState.lowerLimit) {
			State state = new RedState(this);
			account.state = state;
		} else if (balance > SilverState.upperLimit) {
			State state = new GoldenState(this);
			account.setState(state);
		}
	}

}
