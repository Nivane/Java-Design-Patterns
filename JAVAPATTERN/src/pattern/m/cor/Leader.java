package pattern.m.cor;

public class Leader extends Handler{

	@Override
	int getLimit() {
		// TODO Auto-generated method stub
		return 1000;
	}

	@Override
	void setNextHandler() {
		// TODO Auto-generated method stub
		this.nextHandler = new Manager();
	}

}
