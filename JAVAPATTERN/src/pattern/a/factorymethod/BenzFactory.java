
package pattern.a.factorymethod;

public  class BenzFactory extends CarFactory{

	@Override
	public Car makeCar() {
		// TODO Auto-generated method stub
		System.out.println("Make Benz");
		return new Benz();
	}
}
