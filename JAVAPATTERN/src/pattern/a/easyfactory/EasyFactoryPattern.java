package pattern.a.easyfactory;

public class EasyFactoryPattern {

	public static void main(String[] args) throws Exception {
		Car car = CarEasyFactory.buyCar(Audi.class);
		Car car1 = CarEasyFactory.buyCar(Benz.class);
		Car car2 = CarEasyFactory.buyCar(BMW.class);
		car.makeCar();
		car1.makeCar();
		car2.makeCar();
	}
}
