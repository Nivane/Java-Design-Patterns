package pattern.b.abstractfactory;

public  class WomanDriverFactory extends DriverFactory {

	@Override
	public Driver makeDriver() {
		// TODO Auto-generated method stub
		System.out.println("Make Woman Driver");
		return new WomanDriver();
	}

	@Override
	public Car makeCar() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
