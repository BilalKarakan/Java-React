package inheritance2;

public class CustomerManager {
	/*
	public void add() {
		System.out.println("M�steri Eklendi.");
		DatabaseLogger logger = new DatabaseLogger();
		logger.log();
	}
	*/
	
	public void add(Logger logger) {
		System.out.println("M��teri Eklendi.");
		logger.log();
	}
}
