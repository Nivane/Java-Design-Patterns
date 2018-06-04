package pattern.w.visitor;

import java.util.List;

public class VisitorPattern {
	public static void main(String[] args) {
		
		List<Element> list = ObjectStructure.getList();
		for(Element e : list) {
			
			e.accept(new ConcreteVisitor());
		}
	}
}	
