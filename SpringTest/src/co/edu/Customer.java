package co.edu;

public class Customer {

	private long customerId;
	private String customerName;
	private String customerContact;
	private Address customerAddress;

	public void displayInfo() {
		System.out.println("customerId: "+customerId);
		System.out.println("customerName: "+customerName);
		System.out.println("customerContact: "+customerContact);
		System.out.println("customerAddress: "+customerAddress.getCountry()+" : "+customerAddress.getState());
	}

	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
}
