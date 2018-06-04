package pattern.v.template;

/**
 * @author ZLP
 * 		         ׼��һ�������࣬�������߼��Ծ��巽���Լ����幹�캯������ʽʵ�֣�Ȼ������һЩ���󷽷�����ʹ����ʵ��ʣ����߼���
 *         ��ͬ����������Բ�ͬ�ķ�ʽʵ����Щ���󷽷����Ӷ���ʣ����߼��в�ͬ��ʵ�֡� AbstractTemplate:
 *         AbstractTemplate TemplateMethod ConcreteMethod HookMethod ConcreteTemplate:
 *         ConcreteMethod	AbstractMethod HookMethod
 */
public class TemplatePattern {
	public static void main(String[] args) {
		SystemAccount account = new CDAccount();
		System.out.println(account.computeInterest(6666));
	}
}
