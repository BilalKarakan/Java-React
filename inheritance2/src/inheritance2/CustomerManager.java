package inheritance2;

public class CustomerManager {
	/*
	public void add() {
		System.out.println("Müsteri Eklendi.");
		DatabaseLogger logger = new DatabaseLogger();
		logger.log();
	}
	*/
	
	public void add(Logger logger) {
		System.out.println("Müþteri Eklendi.");
		logger.log();
	}
}
