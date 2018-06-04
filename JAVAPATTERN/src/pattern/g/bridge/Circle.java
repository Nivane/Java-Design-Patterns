package pattern.g.bridge;

public class Circle extends Shape{



	public Circle(String name, DrawAPI drawAPI) {
		super(drawAPI);
		// TODO Auto-generated constructor stub
		System.out.println(name);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.drawAPI.draw();
	}

}
