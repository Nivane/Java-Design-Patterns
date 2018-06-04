package pattern.t.state;

public class RedState extends State {

	private static int upperLimit = 0;
	private static int lowerLimit = Integer.MIN_VALUE;
	
	public RedState(State state) {
		this.balance = state.balance;
		this.account = state.getAccount();
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
		System.out.println("已是红色预警，存款不足提取");

	}

	@Override
	void checkState() {
		// TODO Auto-generated method stub
		if (this.balance > RedState.upperLimit) {
			State state = new SilverState(this);
			account.setState(state);
		}
	}

}
