package pattern.c.builder;

/**
 * @author ZLP 将一个复杂对象的构建过程和对象的构建部件分开
 */
public abstract class Builder {

	abstract void buildCPU();

	abstract void buildBoard();

	abstract void buildDisk();
	
	abstract Computer getComputer();
}
