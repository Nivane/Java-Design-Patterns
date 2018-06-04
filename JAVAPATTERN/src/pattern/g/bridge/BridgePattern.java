package pattern.g.bridge;

/**
 * @author ZLP
 * http://www.runoob.com/design-pattern/bridge-pattern.html
 * ���������ʵ�������
 * ��ʹ�ü̳У����ǽ���ͬά�ȷ����������ֹ�౬ը
 * ����������ʵ����
 */
public class BridgePattern {
	public static void main(String[] args) {
		
		Shape redCircle = new Circle("red", new RedCircleDraw());
		redCircle.draw();
		
	}
}
