package pattern.o.interpreter;

public class NonTerminalExpression extends AbstractExpression{

	
	private AbstractExpression a1;
	private AbstractExpression a2;
	
	public NonTerminalExpression(AbstractExpression a1, AbstractExpression a2) {
		this.a1 = a1;
		this.a2 = a2;
	}
	
	@Override
	boolean interprete(String context) {
		// TODO Auto-generated method stub
		
		return a1.interprete(context) || a2.interprete(context);
	}

}
