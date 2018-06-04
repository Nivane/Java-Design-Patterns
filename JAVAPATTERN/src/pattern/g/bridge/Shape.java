package pattern.g.bridge;

/**
 * @author ZLP
 *
 */
abstract class Shape {
	
	DrawAPI drawAPI;
	
	public Shape(DrawAPI drawAPI) {
		// TODO Auto-generated constructor stub
		this.drawAPI = drawAPI;
	}
	
	public abstract void draw();
	
	
}
