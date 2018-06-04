package pattern.c.builder;

/**
 * @author ZLP
 * ��һ�����ӵĹ��������ʾ����
 */
public class BuilderPattern {
	
	public static void main(String[] args) {
		Builder b = new ConcreteBuilder();
		Director d = new Director();
		d.construct(b);
		Computer pc = b.getComputer();
		pc.show();
	}
}