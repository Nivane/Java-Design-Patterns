package pattern.u.strategy;

/**
 * @author ZLP
 *�㷨������ʹ�����Ŀͻ��������仯
 *ͬһ�������ж�����࣬������Ҫʹ�� if-else ���� switch-case ��ѡ���������
 */
public class StrategyPattern {
	public static void main(String[] args) {
		
		Context context = new Context(new SVIPUser());
		context.buySkin();
		
	}
}
