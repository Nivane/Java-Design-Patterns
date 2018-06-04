package pattern.h.composite;

import java.util.ArrayList;

public class ConcreteCompany extends Company{
	
	ArrayList<Company> arrayList;
	
	public ConcreteCompany(String name) {
		super(name);
		arrayList = new ArrayList<Company>();
		// TODO Auto-generated constructor stub
	}

	@Override
	void addCompany(Company company) {
		// TODO Auto-generated method stub
		arrayList.add(company);
	}

	@Override
	void removeCompany(Company company) {
		// TODO Auto-generated method stub
		arrayList.remove(company);
	}

	@Override
	void display(int depth) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < depth; i++) {
			sb.append("-");
		}
		System.out.println(new String(sb) + this.getName());
//		µÝ¹éÏÔÊ¾
		for(Company c : arrayList) {
			c.display(depth + 2);
		}
	}
	
	
}
