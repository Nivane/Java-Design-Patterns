package pattern.n.command;

/**
 * @author ZLP
 * Command	ConcreteCommand Receiver Invoker
 */
public class CommandPattern {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		
		invoker.setCommand(command);
		command.execute();
	}
}
