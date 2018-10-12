package com.advance.servicesImpl;

import java.util.HashMap;
import java.util.Map;

import com.advance.managedbean.Customer;
import com.advance.services.LookupService;

public class LookupServiceImplMap implements LookupService {
	
	private Map<Long,Customer> customers;
	
	public LookupServiceImplMap() {
		customers = new HashMap<Long,Customer>();
		addCustomer(new Customer(1, "Mike", "Jobs", 234.45));
		addCustomer(new Customer(2, "Steven", "Bill", 11234.45));
		addCustomer(new Customer(3, "Kevin", "Bush", -1234.45));
	}

	private void addCustomer(Customer customer) {
		customers.put(customer.getId(), customer);
	}

	@Override
	public Customer lookupCustomerById(long id) {
		 return customers.get(id);
	}

}
