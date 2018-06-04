package pattern.o.interpreter;

public class TerminalExpression extends AbstractExpression{

	private String data;
	
	public	TerminalExpression(String data) {
		this.data = data;
	}
	
	@Override
	boolean interprete(String context) {
		// TODO Auto-generated method stub
		if(context.contains(data)) {
			return true;
		}
		return false;
	}
	
}
 