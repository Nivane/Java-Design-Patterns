package pattern.d.singleton;

/**
 * @author ZLP
 */
public class Singleton {

	private static Singleton sp;

	private static int pi = 3;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (sp == null) {
			sp = new Singleton();
		}
		Singleton.pi += 1;
		return sp;
	}

	public int getPi() {
		return pi;
	}

	public void setPi(int pi) {
		Singleton.pi = pi;
	}

}