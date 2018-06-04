package pattern.k.flyweight;

public class Circle implements Shape {

	private String color;

	public Circle(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw" + this.color +"Circle");

	}

}
