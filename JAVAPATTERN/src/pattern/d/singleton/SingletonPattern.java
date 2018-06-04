package pattern.d.singleton;

/**
 * @author ZLP
 * private和static的使用
 * 一个类只能有一个实例对象
 */
public class SingletonPattern {

	public static void main(String[] args) {

		Singleton single = Singleton.getInstance();
		System.out.println(single.getPi());

	}
}

