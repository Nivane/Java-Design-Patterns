package pattern.c.builder;

public class Director {
	
	public Director(){
		
	}
	
	public void construct(Builder builder) {
		builder.buildBoard();
		builder.buildCPU();
		builder.buildDisk();
	}

}
