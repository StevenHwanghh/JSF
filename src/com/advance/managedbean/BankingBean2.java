package com.advance.managedbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.commons.lang3.StringUtils;

import com.advance.servicesImpl.LookupServiceImplMap;

@ManagedBean
@SessionScoped
public class BankingBean2 {
	
	private String customerId;
	private String password;
	private Customer customer;
	
	public BankingBean2() {
		customerId = "1";
	}
	
	private LookupServiceImplMap lookupService = new LookupServiceImplMap();
	private long id;
	
	public String showBalance() {
		if(!password.equals("123")) {
			return "wrong-password";
		}
		if(StringUtils.isNumeric(this.customerId)) {
			id = Long.valueOf(customerId);
		}
		customer = lookupService.lookupCustomerById(id);
		if(customer==null) {
			return "unknown-customer";
		}else if(customer.getBalance()<0){
			return "negative-balance";
		}else if(customer.getBalance()<1000.0){
			return "normal-balance2?faces-redirect=true";
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

	public Customer getCustomer() {
		return customer;
	}
}
