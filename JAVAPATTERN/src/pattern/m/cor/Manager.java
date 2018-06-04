package pattern.m.cor;

public class Manager extends Handler{
	
	
	@Override
	int getLimit() {
		// TODO Auto-generated method stub
		return 2000;
	}

	@Override
	void setNextHandler() {
		// TODO Auto-generated method stub
		this.nextHandler = new Boss();
	}

}
