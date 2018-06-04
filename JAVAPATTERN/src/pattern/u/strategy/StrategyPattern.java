package pattern.u.strategy;

/**
 * @author ZLP
 *算法独立于使用它的客户而独立变化
 *同一抽象类有多个子类，而又需要使用 if-else 或者 switch-case 来选择具体子类
 */
public class StrategyPattern {
	public static void main(String[] args) {
		
		Context context = new Context(new SVIPUser());
		context.buySkin();
		
	}
}
