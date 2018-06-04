package pattern.a.factorymethod;

public class FactoryMethodPattern {
	public static void main(String[] args) {

		CarFactory AudiFactory = new AudiFactory();
		Car audi = AudiFactory.makeCar();
		audi.getCar();

		CarFactory BenzFactory = new BenzFactory();
		Car Benz = BenzFactory.makeCar();
		Benz.getCar();

		CarFactory BMWFactory = new BMWFactory();
		Car BMW = BMWFactory.makeCar();
		BMW.getCar();

	}
}
