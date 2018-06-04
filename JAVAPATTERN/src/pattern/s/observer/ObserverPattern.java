package pattern.s.observer;

public class ObserverPattern {
	public static void main(String[] args) {

		Subject cat = new Cat();
		cat.addObservers(new Dog());
		cat.cry();
		cat.addObservers(new Mouse());
		cat.cry();
	}
}
