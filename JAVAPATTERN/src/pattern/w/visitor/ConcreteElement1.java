package pattern.w.visitor;

public class ConcreteElement1 extends Element{

	@Override
	void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

	@Override
	void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("E1 doing...");
	}

}
