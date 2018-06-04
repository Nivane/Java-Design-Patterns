package pattern.j.facade;

/**
 * @author ZLP
 * 为子系统中的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用
 */
public class FacadePattern {
	public static void main(String[] args) {
		
		ShapeFacade sf = new ShapeFacade();
		sf.drawCircle();
		sf.drawSquare();
	}
}
