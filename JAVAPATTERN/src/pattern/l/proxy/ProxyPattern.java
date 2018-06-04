package pattern.l.proxy;

/**
 * @author ZLP
 * 为对象提供一种代理以控制对这个对象的访问
 */
public class ProxyPattern {
	public static void main(String[] args) {
		
		MediaPlayerProxy mpp = new MediaPlayerProxy();
		mpp.play("nogizaka46");
	}
}
