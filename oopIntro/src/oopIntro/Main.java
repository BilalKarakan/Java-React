package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenovo Ideapad",15000,"16 GB RAM"); 
		
		Product product2 = new Product();  //Referans Olu�turma, instance
		product2.id = 1;
		product2.name = "Casper Nirvana";
		product2.unitPrice = 10000;
		product2.description = "8 GB RAM";
		
		Product product3 = new Product(); 
		product3.id = 3;
		product3.name = "Asus ROG";
		product3.unitPrice = 20000;
		product3.description = "32 GB RAM";
		
		
		//Product[] products = {};
		Product[] products = {product1, product2, product3};
		for(Product product:products) {
			System.out.println(product.name);
		}
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev/Bah�e";
		
		System.out.println(category1.name);
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
	}
	

	}
