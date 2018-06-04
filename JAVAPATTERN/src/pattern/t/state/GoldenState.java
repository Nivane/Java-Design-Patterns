package pattern.t.state;

public class GoldenState extends State {

	private static int lowerLimit = 1000;
	private static int upperLimit = Integer.MAX_VALUE;
	
	public GoldenState(State state) {
		this.balance = state.balance;
		this.account = state.getAccount();
	}

	@Override
	void deposit(int amount) {
		// TODO Auto-generated method stub
		balance += amount;
		checkState();

	}

	@Override
	void withdraw(int amount) {
		// TODO Auto-generated method stub
		balance -= amount;
		checkState();
	}

	@Override
	void checkState() {
		// TODO Auto-generated method stub
		if (balance < GoldenState.lowerLimit) {
			State state = new SilverState(this);
			account.setState(state);
		}
		
	}

}
