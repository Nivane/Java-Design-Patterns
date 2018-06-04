package pattern.o.interpreter;

/**
 * @author ZLP AbstractExpression TerminalExpression NonTerminalExpression
 *         Context
 */
public class InterpreterPattern {

	public static AbstractExpression getExpression() {
		
		return new NonTerminalExpression(new TerminalExpression("nogizaka"), new TerminalExpression("keyakizaka"));
		
	}
	
	public static void main(String[] args) {
		
		AbstractExpression ae = getExpression();
		System.out.println(ae.interprete("nogizaka"));
		System.out.println(ae.interprete("yoshimotozaka"));
		
	}
}
