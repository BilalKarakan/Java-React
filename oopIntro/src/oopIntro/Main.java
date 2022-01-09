package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Lenovo Ideapad",15000,"16 GB RAM", 10 /*13000*/); 
		
		Product product2 = new Product();  //Referans Oluþturma, instance
/*		product2.id = 1;
		product2.name = "Casper Nirvana";
		product2.unitPrice = 10000;
		product2.description = "8 GB RAM";
		product2.discount = 10;
		product2.unitPriceAfterDiscount = 14400;
*/
		product2.setId(2);
		product2.setName("Casper Nirvana");
		product2.setUnitPrice(10000);
		product2.setDescription("8 GB RAM");
		product2.setDiscount(10);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
/*
		Product product3 = new Product();
		product3.id = 3;
		product3.name = "Asus ROG";
		product3.unitPrice = 20000;
		product3.description = "32 GB RAM";
*/		
		
		//Product[] products = {};
		
/*
		Product[] products = {product1, product2, product3};
		for(Product product:products) {
			System.out.println(product.name);
		}
		System.out.println(products.length);

*/		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Bilgisayar");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Ev/Bahçe");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		/*
		System.out.println(category1.name + "!");
		System.out.println(category1.name + "!");
		*/
/*	
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);
	}
	
*/
	}
}

