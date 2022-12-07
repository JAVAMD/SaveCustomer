package com.cjc.carloan.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.carloan.app.model.CustomerDetails;
import com.cjc.carloan.app.servicei.CustomerDetailsServiceInterface;


@RequestMapping("/api")
@CrossOrigin("*")
@RestController
public class CustomerDetailsController {
	
	
	@Autowired
	CustomerDetailsServiceInterface cdsi;
	
	@PostMapping(value = "/saveCustomer")
	public ResponseEntity<CustomerDetails> saveCustomer(@RequestBody CustomerDetails cd)
	{
		CustomerDetails csd = cdsi.saveCustomer(cd);
		
		return new ResponseEntity<CustomerDetails>(csd,HttpStatus.OK);
		
		
	}
	
	@GetMapping(value = "/getAllCustomer")
	public ResponseEntity<List<CustomerDetails>> getAllCustomer()
	{
		List<CustomerDetails> csd = cdsi.getAllCustomer();
		
		return new ResponseEntity<List<CustomerDetails>>(csd,HttpStatus.OK);
		
		
	}
	
	@GetMapping("/getOneCustomer/{customerId}")
	public ResponseEntity<Optional<CustomerDetails>> getOneCustomer(@PathVariable Integer customerId)
	{
				Optional<CustomerDetails> csd=cdsi.getOneCustomer(customerId);
		 
		 
		 return new ResponseEntity<Optional<CustomerDetails>>(csd,HttpStatus.OK);
		
	}
	
	


}
