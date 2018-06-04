package pattern.j.facade;

public class ShapeFacade {
	
	private Shape circle;
	private Shape square;
	
	public ShapeFacade() {
		
		circle = new Circle();
		square = new Square();
	}

	public void drawCircle() {
		circle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}
	
}
