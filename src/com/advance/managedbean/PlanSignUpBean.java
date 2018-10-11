package com.advance.managedbean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PlanSignUpBean {

	public String signup() {
		if (Math.random()<0.2) {
			return("accepted");
		}else {
			return("rejected");
		}
	}
}
