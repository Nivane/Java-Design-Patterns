package pattern.j.facade;

/**
 * @author ZLP
 * Ϊ��ϵͳ�е�һ��ӿ��ṩһ��һ�µĽ��棬���ģʽ������һ���߲�ӿڣ�����ӿ�ʹ����һ��ϵͳ��������ʹ��
 */
public class FacadePattern {
	public static void main(String[] args) {
		
		ShapeFacade sf = new ShapeFacade();
		sf.drawCircle();
		sf.drawSquare();
	}
}
