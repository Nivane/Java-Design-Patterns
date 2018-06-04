package pattern.m.cor;

/**
 * @author ZLP
 * Handler nextHandler handleRequest
 */
public class CORPattern {
	public static void main(String[] args) {

		Handler handler = new Leader();
		System.out.println(handler.getLimit());
		handler.handleRequest(6000);

	}
}
