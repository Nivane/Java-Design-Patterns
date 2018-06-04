package pattern.w.visitor;

public class ConcreteElement2 extends Element{

	@Override
	void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("E2 doing...");
	}

	@Override
	void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}


}
