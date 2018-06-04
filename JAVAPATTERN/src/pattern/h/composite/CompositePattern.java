package pattern.h.composite;


/**
 * @author ZLP
 * 将对象组合成树形结构以表示“部分-整体”的层次结构，组合模式使得用户对单个对象和组合对象的使用具有一致性。
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
