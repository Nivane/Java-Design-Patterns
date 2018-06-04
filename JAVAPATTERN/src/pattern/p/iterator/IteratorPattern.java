package pattern.p.iterator;

/**
 * @author ZLP
 * 遍历聚合对象
 */
public class IteratorPattern {

	public static void main(String[] args) {
		
		Container mr = new MemberRepository();
		Iterator i = mr.getMemberIterator();
		while(i.hasNext()) {
			System.out.println(i.next()); 
		}
	}
}
