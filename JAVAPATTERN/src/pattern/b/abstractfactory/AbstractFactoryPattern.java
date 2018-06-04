package pattern.b.abstractfactory;

public class AbstractFactoryPattern {

	public static void main(String[] args) {
		AbstractFactory audiFactory = new AudiFactory();
		Car car = audiFactory.makeCar();
		car.getCar();
		
		AbstractFactory manDriverFactory = new ManDriverFactory();
		Driver driver = manDriverFactory.makeDriver();
		driver.driveCar();
		
		
	}
}
