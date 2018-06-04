package pattern.p.iterator;


public class MemberRepository implements Container{
	
	private String[] members = {"hashimoto", "ikuta", "nakamoto", "sakurai"};
	
	@Override
	public Iterator getMemberIterator() {
		// TODO Auto-generated method stub
		return new MemberIterator();
	}
	
	private class MemberIterator implements Iterator{
		
		int index = 0;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(index < members.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if(this.hasNext()) {
				return members[index++];
			}
			return null;
		}
		
	}

}
