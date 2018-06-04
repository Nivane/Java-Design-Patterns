package pattern.h.composite;


/**
 * @author ZLP
 * ��������ϳ����νṹ�Ա�ʾ������-���塱�Ĳ�νṹ�����ģʽʹ���û��Ե����������϶����ʹ�þ���һ���ԡ�
 */
public class CompositePattern {
	public static void main(String[] args) {
		
		Company root = new ConcreteCompany("ZAKA");
		Company nogi = new ConcreteCompany("Nogi");
		Company keyaki = new ConcreteCompany("Keyaki");
		Company yoshimoto = new MarketDepartment("Yoshimoto");
		
		root.addCompany(nogi);
		root.addCompany(keyaki);
		root.addCompany(yoshimoto);
		
		Company iki = new ConcreteCompany("NogiIki");
		Company niki = new ConcreteCompany("NogiNiki");
		Company ikiManager = new MarketDepartment("ikiManager");
		nogi.addCompany(iki);
		iki.addCompany(ikiManager);
		nogi.addCompany(niki);
		root.display(0);
		
	}
}
