package pattern.k.flyweight;

import java.util.HashMap;

public class ShapeFactory {

	private static HashMap<String, Circle> hm = new HashMap<String, Circle>();
	
	public HashMap<String, Circle> getCircles(){
		return hm;
	}
	
	public Circle getCircle(String color) {

		Circle circle = hm.get(color);
		if (circle == null) {
			circle = new Circle(color);
			hm.put(color, circle);
		}
		return circle;
	}

}
