
package pattern.b.abstractfactory;

public  class AudiFactory extends CarFactory{

	@Override
	public Car makeCar() {
		// TODO Auto-generated method stub
		System.out.println("Make Audi");
		return new Audi();
	}

	@Override
	public Driver makeDriver() {
		// TODO Auto-generated method stub
		return null;
	}
}
