
package pattern.b.abstractfactory;

public  class BMWFactory extends CarFactory{

	@Override
	public Car makeCar() {
		// TODO Auto-generated method stub
		System.out.println("Make BMW");
		return new BMW();
	}

	@Override
	public Driver makeDriver() {
		// TODO Auto-generated method stub
		return null;
	}
}
