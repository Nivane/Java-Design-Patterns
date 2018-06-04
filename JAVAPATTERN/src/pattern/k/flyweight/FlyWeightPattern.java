package pattern.k.flyweight;

/**
 * @author ZLP 
 * ���ٴ���������������Լ����ڴ�ռ�ú�������� �����
 * �����������е�ͬ��������δ�ҵ�ƥ��Ķ����򴴽��¶���
 * �������
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
