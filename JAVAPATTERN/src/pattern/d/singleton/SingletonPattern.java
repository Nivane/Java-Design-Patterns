package pattern.d.singleton;

/**
 * @author ZLP
 * private��static��ʹ��
 * һ����ֻ����һ��ʵ������
 */
public class SingletonPattern {

	public static void main(String[] args) {

		Singleton single = Singleton.getInstance();
		System.out.println(single.getPi());

	}
}

