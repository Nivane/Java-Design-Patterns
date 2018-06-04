package pattern.e.prototype;

/**
 * @author ZLP
 * ʵ�ֽӿ�Cloneable��clone����
 * ������򻯴�������Ĺ���
 */
public class PrototypePattern {

	public static void main(String[] args) throws Exception {
		Spoon ssp = new SilverSpoon();
		Spoon gsp = new GoldenSpoon();
		gsp.setSpoonName("GGoldenSpoon");
		Spoon gsp1 = (Spoon) gsp.clone();
		System.out.println(gsp1.getSpoonName());
		System.out.println(ssp.getSpoonName());
	
	}

}