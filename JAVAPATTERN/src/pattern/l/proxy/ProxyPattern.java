package pattern.l.proxy;

/**
 * @author ZLP
 * Ϊ�����ṩһ�ִ����Կ��ƶ��������ķ���
 */
public class ProxyPattern {
	public static void main(String[] args) {
		
		MediaPlayerProxy mpp = new MediaPlayerProxy();
		mpp.play("nogizaka46");
	}
}
