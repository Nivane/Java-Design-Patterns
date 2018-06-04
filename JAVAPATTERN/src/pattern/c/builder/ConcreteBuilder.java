package pattern.c.builder;

public class ConcreteBuilder extends Builder {
	
	private Computer pc = new Computer();
	
	public ConcreteBuilder() {
		
	}
	
	@Override
	public void buildCPU() {
		// TODO Auto-generated method stub
		pc.add("CPU");
		System.out.println("Build CPU");
	}

	@Override
	public void buildBoard() {
		// TODO Auto-generated method stub
		pc.add("Board");
		System.out.println("Build Board");
	}

	@Override
	public void buildDisk() {
		// TODO Auto-generated method stub
		pc.add("Disk");
		System.out.println("Build Disk");
	}
	
	@Override
	public Computer getComputer() {
		// TODO Auto-generated method stub
		return pc;
	}

	

}
