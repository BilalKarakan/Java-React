package inheritance;

public class CustomerManager {
	/*
	public void add(IndividualCustomer customer) {
		System.out.println(customer.CustomerNumber + " Kaydedildi.");
	}
	
	
	public void add(CorporateCustomer customer) {
		System.out.println(customer.CustomerNumber + " Kaydedildi.");
	}
	*/
	// Ayný method ismi fakat farklý imzalar.(Overloading)
	
	public void add(Customer customer) {
		System.out.println(customer.CustomerNumber + " Kaydedildi.");
	}
	
	//Bulk Insert
	public void addMultiple(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}
}
