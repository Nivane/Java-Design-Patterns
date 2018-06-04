package pattern.s.observer;

public class Cat extends Subject{

	@Override
	void cry() {
		// TODO Auto-generated method stub
		System.out.println("Cat Cry");
		
		for(Observer observer : this.getObservers()) {
			observer.response();
		}
	}

}
