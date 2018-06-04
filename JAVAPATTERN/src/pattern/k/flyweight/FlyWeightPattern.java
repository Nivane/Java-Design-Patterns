package pattern.k.flyweight;

/**
 * @author ZLP 
 * 减少创建对象的数量，以减少内存占用和提高性能 对象池
 * 尝试重用现有的同类对象，如果未找到匹配的对象，则创建新对象
 * 共享对象
 */
public class FlyWeightPattern {

	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black","Gray", "Brown", "Yello" };

	public static void main(String[] args) {
		ShapeFactory shape = new ShapeFactory();
		Circle circle;
		for(int i = 0; i < 10; i++) {
			circle = shape.getCircle(getRandomColor());
			circle.draw();
		}
		
		System.out.println("---------------------------");
		for(String color : shape.getCircles().keySet()) {
			shape.getCircles().get(color).draw();
		}
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

}
