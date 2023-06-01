package lab2.objects;

import lesson2.basics.typicalprogram.Address;

public class Main {

	public static void main(String[] args) {
		
		Address billing1 = new Address("3135 Linden St", "Oakland", "CA", "94608");
		Address shipping1 = new Address("1027 McAllister St", "San Francisco", "CA", "94115");
		Address billing2 = new Address("4210 N Cicero Ave", "Chicago", "IL", "60641");
		Address shipping2 = new Address("2818 W Diversey Ave", "Chicago", "IL", "60647");
	
		Customer cust1 = new Customer("Joe", "Smith");
		cust1.setSocSecurityNum("332-221-4444");
		cust1.setBillingAddress(billing1);
		cust1.setShippingAddress(shipping1);
		
		Customer cust2 = new Customer("Helen", "Yhdgo");
		cust2.setSocSecurityNum("123-45-6789");
		cust2.setBillingAddress(billing2);
		cust2.setShippingAddress(shipping2);
		
		//print info about Employee 1
		System.out.println(cust1.toString());
		System.out.println(" Billing address: "+cust1.getBillingAddress().toString());
		System.out.println(" Shipping address: " +cust1.getShippingAddress().toString());
		
		//Create an Employee array of length 2
		Customer[] custArray = new Customer[2];
		custArray[0] = cust1;
		custArray[1] = cust2;
		
		//Search the array for an Employee having billing address city  "Chicago"
		//If found, print out the Employee's full name
		
		for(int i = 0; i < custArray.length; i++) {
			String billing = custArray[i].getBillingAddress().getCity();
			if(billing.equals("Chicago")) {
				System.out.println("Employee found: " + custArray[i]);
			}
		}
		
	}
	
}
