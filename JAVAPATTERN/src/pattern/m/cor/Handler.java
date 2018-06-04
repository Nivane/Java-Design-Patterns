package pattern.m.cor;

public abstract class Handler {

	Handler nextHandler;

	public Handler getNextHandler() {
		return nextHandler;
	}

	abstract void setNextHandler();

	abstract int getLimit();

	public void handleRequest(int amount) {
		if (getLimit() > amount) {
			System.out.println(this.getClass().getName());
			System.out.println("�ѱ���");
		} else {
			System.out.println(this.getClass().getName());
			System.out.println("��ǰ��Ȳ���");
			this.setNextHandler();
			nextHandler.handleRequest(amount);
		}
	}
}
