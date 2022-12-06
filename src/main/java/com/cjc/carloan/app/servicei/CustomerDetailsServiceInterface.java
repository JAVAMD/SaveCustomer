package com.cjc.carloan.app.servicei;

import java.util.List;

import com.cjc.carloan.app.model.CustomerDetails;

public interface CustomerDetailsServiceInterface {

	public CustomerDetails saveCustomer(CustomerDetails cd);

	public List<CustomerDetails> getAllCustomer();
	
	

}
