package pattern.t.state;


/**
 * @author ZLP
 * https://blog.csdn.net/cjjky/article/details/7585207
 * Context State ConcreteState  checkState
 */
public class StatePattern {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.deposit(100);
		account.withdraw(200);
		account.deposit(1000);
		account.deposit(10000);		
	}
}
