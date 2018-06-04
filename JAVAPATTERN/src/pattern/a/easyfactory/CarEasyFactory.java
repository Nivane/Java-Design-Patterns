package pattern.a.easyfactory;

public class CarEasyFactory {

	public static Car buyCar(Class<?> clazz) throws Exception {

		Car car = (Car) Class.forName(clazz.getName()).newInstance();

		return car;

	}
}
