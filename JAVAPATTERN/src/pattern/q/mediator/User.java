package pattern.q.mediator;

import java.util.ArrayList;

public class User {
	ArrayList a;
	private String name;
	public User(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void sendMsg(String msg) {
		ChatRoom.showMessage(name, msg);
	}
	
}
