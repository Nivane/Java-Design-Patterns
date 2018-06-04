package pattern.w.visitor;

public class ConcreteVisitor implements Visitor{

	@Override
	public void visit(Element element) {
		// TODO Auto-generated method stub
		element.doSomething();
	}

}
