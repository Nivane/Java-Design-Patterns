package pattern.r.memento;

/**
 * @author ZLP 在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样就可以将该对象恢复到原先保存的状态
 *         Originator Mementor CareTaker
 */
public class MementoPattern {
	public static void main(String[] args) {

		String state = "HIGH";
		Originator o = new Originator();
		o.setState(state);
		CareTaker ct = new CareTaker();
		ct.saveMemento(o.createMemento());
		System.out.println(o.getState());

		state = "SUPER HIGH";
		o.setState(state);
		System.out.println(o.getState());

		o.restoreMemento(ct.retrieveMemento());
		System.out.println(o.getState());
	}
}
