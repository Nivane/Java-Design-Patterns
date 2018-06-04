
package pattern.a.factorymethod;

public  class BMWFactory extends CarFactory{

	@Override
	public Car makeCar() {
		// TODO Auto-generated method stub
		System.out.println("Make BMW");
		return new BMW();
	}
}
