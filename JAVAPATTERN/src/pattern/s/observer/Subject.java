package pattern.s.observer;

import java.util.ArrayList;

public abstract class Subject {
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();

	public ArrayList<Observer> getObservers() {
		return observers;
	}

	public void setObservers(ArrayList<Observer> observers) {
		this.observers = observers;
	}

	public void addObservers(Observer observer) {
		observers.add(observer);
	}

	public void removeObservers(Observer observer) {
		observers.remove(observer);
	}
	
	abstract void cry();
	
	
}
