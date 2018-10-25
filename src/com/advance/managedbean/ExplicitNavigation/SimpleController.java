package com.advance.managedbean.ExplicitNavigation;

import javax.faces.bean.ManagedBean;

import org.apache.commons.lang.math.RandomUtils;
@ManagedBean
public class SimpleController {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String doNavigation() {
		if(this.message.length()<2) {
			return "too-short";
		}else {
			String[] results = {"result1","result2","result3"};
			int nextInt = RandomUtils.nextInt(3);
			System.out.println(nextInt);
			return results[nextInt];
		}
	}
}
