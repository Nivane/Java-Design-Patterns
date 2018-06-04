package pattern.u.strategy;

public class Context {

	Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void buySkin() {
		strategy.buySkin();
	}
}
