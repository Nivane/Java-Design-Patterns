package pattern.w.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ObjectStructure {
	
	public static List<Element> getList(){
		List<Element> list = new ArrayList<Element>();
		
		for(int i = 0; i < 10; i++) {
			int j = new Random().nextInt(100);
			if(j > 50) {
				list.add(new ConcreteElement1());
			}else {
				list.add(new ConcreteElement2());
			}
			
		}
		
		return list;
	}
}
