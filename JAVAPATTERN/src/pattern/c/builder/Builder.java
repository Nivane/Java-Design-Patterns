package pattern.c.builder;

/**
 * @author ZLP ��һ�����Ӷ���Ĺ������̺Ͷ���Ĺ��������ֿ�
 */
public abstract class Builder {

	abstract void buildCPU();

	abstract void buildBoard();

	abstract void buildDisk();
	
	abstract Computer getComputer();
}
