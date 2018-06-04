package pattern.c.builder;

/**
 * @author ZLP
 * 将一个复杂的构建与其表示分离
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