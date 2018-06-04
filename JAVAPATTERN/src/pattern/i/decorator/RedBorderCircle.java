package pattern.i.decorator;

public class RedBorderCircle extends ShapeDecorator{
	
	public RedBorderCircle(Shape shape) {
		super(shape);
		// TODO Auto-generated constructor stub
	}
	
	
	public void draw() {
		this.shape.draw();
		this.drawRed();
	}
	
	@Override
	void drawRed() {
		// TODO Auto-generated method stub
		System.out.println("Draw Red");
	}

		
}
