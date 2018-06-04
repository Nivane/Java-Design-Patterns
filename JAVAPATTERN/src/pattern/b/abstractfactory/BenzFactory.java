
package pattern.b.abstractfactory;

public  class BenzFactory extends CarFactory{

	@Override
	public Car makeCar() {
		// TODO Auto-generated method stub
		System.out.println("Make Benz");
		return new Benz();
	}

	@Override
	public Driver makeDriver() {
		// TODO Auto-generated method stub
		return null;
	}
}
