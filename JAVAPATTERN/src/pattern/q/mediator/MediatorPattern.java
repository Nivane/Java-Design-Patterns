package pattern.q.mediator;

/**
 * @author ZLP
 * 一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，从而使其耦合松散，而且可以独立地改变它们之间的交互。
 */
public class MediatorPattern {
	public static void main(String[] args) {
		
		User nanamin = new User("NaNaMin");
		nanamin.sendMsg("kizuitara kataomo i");
	}
}
