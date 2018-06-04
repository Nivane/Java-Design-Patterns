package pattern.h.composite;

abstract class Company {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Company(String name) {
		this.name = name;
	}

	abstract void addCompany(Company company);

	abstract void removeCompany(Company company);

	abstract void display(int depth);

}
