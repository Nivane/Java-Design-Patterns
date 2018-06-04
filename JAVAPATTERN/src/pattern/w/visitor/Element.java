package pattern.w.visitor;

abstract class Element {

	abstract void accept(Visitor visitor);

	abstract void doSomething();
}
