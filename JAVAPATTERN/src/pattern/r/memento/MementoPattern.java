package pattern.r.memento;

/**
 * @author ZLP �ڲ��ƻ���װ�Ե�ǰ���£�����һ��������ڲ�״̬�����ڸö���֮�Ᵽ�����״̬�������Ϳ��Խ��ö���ָ���ԭ�ȱ����״̬
 *         Originator Mementor CareTaker
 */
public class MementoPattern {
	public static void main(String[] args) {

		String state = "HIGH";
		Originator o = new Originator();
		o.setState(state);
		CareTaker ct = new CareTaker();
		ct.saveMemento(o.createMemento());
		System.out.println(o.getState());

		state = "SUPER HIGH";
		o.setState(state);
		System.out.println(o.getState());

		o.restoreMemento(ct.retrieveMemento());
		System.out.println(o.getState());
	}
}
