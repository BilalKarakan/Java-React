package oopIntro;

public class Product {
	int id;
	String name;
	double unitPrice;
	String description;
	
	public Product() {
		System.out.println("Constructor yap� �al��t�.");
	}
	
	public Product(int id, String name, double unitPrice, String description) {
		this();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.description = description;
	}
	
}
