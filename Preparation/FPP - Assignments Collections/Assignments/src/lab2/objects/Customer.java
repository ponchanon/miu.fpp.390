package lab2.objects;

import lesson2.basics.typicalprogram.Address;

public class Customer {
	static final String IMPORTANT_FIRST = "Boss";
	static final String IMPORTANT_LAST =  "Jones";
	private String firstName;
	private String lastName;
	private String socSecurityNum;
	private Address billingAddress;
	private Address shippingAddress;
	
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//default constructor 
	public Customer() {
		this(IMPORTANT_FIRST, IMPORTANT_LAST);
	}
	
	/** Provides a string representation of this Employee */
	public String toString() {
		return "[" + firstName + ", " + lastName + ", ssn: " + socSecurityNum + "]";
	}

	public String getSocSecurityNum() {
		return socSecurityNum;
	}

	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
