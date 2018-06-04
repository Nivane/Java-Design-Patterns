package pattern.r.memento;

public class Originator {
	
	private String state;
	
	public Memento createMemento() {
		return new Memento(state);
	}
	
	/**
	 * @param memento
	 * 将发起人恢复到备忘录对象所记载的状态
	 */
	public void restoreMemento(Memento memento) {
		this.state = memento.getState();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
