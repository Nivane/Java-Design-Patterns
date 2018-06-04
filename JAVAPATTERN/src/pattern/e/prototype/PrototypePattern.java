package pattern.e.prototype;

/**
 * @author ZLP
 * 实现接口Cloneable的clone方法
 * 深拷贝，简化创建对象的过程
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