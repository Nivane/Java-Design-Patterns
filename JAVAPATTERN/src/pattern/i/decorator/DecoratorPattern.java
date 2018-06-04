package pattern.i.decorator;

public class DecoratorPattern {
	public static void main(String[] args) {

		ShapeDecorator sd = new RedBorderCircle(new Circle());
		sd.draw();
	}
}

