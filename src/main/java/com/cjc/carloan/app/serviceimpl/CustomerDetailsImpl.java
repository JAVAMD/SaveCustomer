package com.cjc.carloan.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.carloan.app.model.CustomerDetails;
import com.cjc.carloan.app.repository.CustomerDetailsRepositary;
import com.cjc.carloan.app.servicei.CustomerDetailsServiceInterface;

@Service
public class CustomerDetailsImpl implements CustomerDetailsServiceInterface {
	
	@Autowired 
	CustomerDetailsRepositary cdr;
	
	

	@Override
	public CustomerDetails saveCustomer(CustomerDetails cd) {
		
		return cdr.save(cd);
	}



	@Override
	public List<CustomerDetails> getAllCustomer() {
		
		return cdr.findAll();
	}

}
