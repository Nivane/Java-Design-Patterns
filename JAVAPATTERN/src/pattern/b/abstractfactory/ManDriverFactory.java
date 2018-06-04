package pattern.b.abstractfactory;

public class ManDriverFactory extends DriverFactory{

	@Override
	public ManDriver makeDriver() {
		// TODO Auto-generated method stub
		System.out.println("Make Man Driver");
		return new ManDriver();
	}

	@Override
	public Car makeCar() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
