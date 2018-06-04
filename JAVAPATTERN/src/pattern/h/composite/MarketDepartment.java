package pattern.h.composite;

public class MarketDepartment extends Company{

	public MarketDepartment(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void addCompany(Company company) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void removeCompany(Company company) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void display(int depth) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < depth; i++) {
			sb.append("-");
		}
		System.out.println(new StringBuffer(sb) + this.getName());
	}

}
