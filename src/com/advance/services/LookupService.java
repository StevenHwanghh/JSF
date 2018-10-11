package com.advance.services;

import com.advance.managedbean.Customer;

public interface LookupService {
	
	public Customer lookupCustomerById(long id);
}
