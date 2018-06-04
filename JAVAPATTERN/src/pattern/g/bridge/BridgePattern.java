package pattern.g.bridge;

/**
 * @author ZLP
 * http://www.runoob.com/design-pattern/bridge-pattern.html
 * 将抽象类和实现类分离
 * 不使用继承，而是将不同维度分离出来，防止类爆炸
 * 抽象类依赖实现类
 */
public class BridgePattern {
	public static void main(String[] args) {
		
		Shape redCircle = new Circle("red", new RedCircleDraw());
		redCircle.draw();
		
	}
}
