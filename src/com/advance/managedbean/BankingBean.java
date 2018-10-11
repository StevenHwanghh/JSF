package com.advance.managedbean;

import javax.faces.bean.ManagedBean;

import org.apache.commons.lang3.StringUtils;

import com.advance.servicesImpl.LookupServiceImplMap;

@ManagedBean
public class BankingBean {
	
	private String customerId;
	private String password;
	private Customer customer;
	
	private LookupServiceImplMap lookupService = new LookupServiceImplMap();
	private long id;
	
	public String showBalance() {
		if(StringUtils.isNumeric(this.customerId)) {
			id = Long.valueOf(customerId);
		}
		if(!password.equals("123")) {
			return "wrong-password";
		}
		customer = lookupService.lookupCustomerById(id);
		if(customer==null) {
			return "unknown-customer";
		}else if(customer.getBanlance()<0){
			return "negative-balance";
		}else if(customer.getBanlance()<1000L){
			return "normal-balance";
		}else {
			return "high-balance";
		}
	}


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
