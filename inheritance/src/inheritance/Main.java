package inheritance;

public class Main {

	public static void main(String[] args) {
		/*
		Customer customer = new Customer();
		customer.id = 1;
		customer.firstName = "Bilal";
		customer.lastName = "Karakan";
		customer.nationalIdentity = "11111111111";
		customer.CustomerNumber = "1234";
		*/
		
		IndividualCustomer bilal = new IndividualCustomer();
		bilal.CustomerNumber = "1234";
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.CustomerNumber = "5678";
		hepsiBurada.companyName = "Hepsi Burada";
		
		UnionCustomer unionCustomer = new UnionCustomer();
		unionCustomer.CustomerNumber = "2468";
		
		CustomerManager customerManager = new CustomerManager();
		/*
		customerManager.add(hepsiBurada);
		customerManager.add(bilal);
		customerManager.add(unionCustomer);
		*/
		
		Customer[] customers = {hepsiBurada, bilal, unionCustomer};
		
		customerManager.addMultiple(customers);
		
	}

}
