package pattern.c.builder;

import java.util.ArrayList;

public class Computer {
	
	private ArrayList<String> pcArray;
	
	public Computer() {
		pcArray = new ArrayList<String>();
	}
	
	public void add(String part) {
		pcArray.add(part);
	}
	
	public void show() {
		if(pcArray.size() < 3) {
			System.out.println("Failed");
		}else {
			System.out.println("Succeed");
		}
	}
}
