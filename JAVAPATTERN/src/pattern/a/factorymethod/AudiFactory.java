
package pattern.a.factorymethod;

public  class AudiFactory extends CarFactory{

	@Override
	public Car makeCar() {
		// TODO Auto-generated method stub
		System.out.println("Make Audi");
		return new Audi();
	}
}
