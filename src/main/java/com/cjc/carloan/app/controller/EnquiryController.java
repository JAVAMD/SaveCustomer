package com.cjc.carloan.app.controller;


import java.util.List;
import java.util.Random;

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
import com.cjc.carloan.app.model.EnquiryDetails;
import com.cjc.carloan.app.servicei.EnquiryService;



@RequestMapping("/api")
@CrossOrigin("*")
@RestController
public class EnquiryController 
{
	@Autowired
	 private EnquiryService es;
	

	@PostMapping("/createEnquiry")
	 public ResponseEntity<EnquiryDetails> createEnquiryDetails(@RequestBody EnquiryDetails enquiryDetail)
	 {
		try
		{
		EnquiryDetails ed1=null;
	    ed1=es.createEnquiry(enquiryDetail);
		 return new ResponseEntity<EnquiryDetails>(ed1, HttpStatus.CREATED);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return new ResponseEntity<EnquiryDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	 }
	
	

		@GetMapping("/getEnquiries")
		public ResponseEntity<List<EnquiryDetails>> displayAllEnquiry()
		{
	
			List<EnquiryDetails> list=es.displayEnquiry();
			if(list.isEmpty())
			{
				return new ResponseEntity<List<EnquiryDetails>>(HttpStatus.NOT_FOUND);
			}
			return new ResponseEntity<List<EnquiryDetails>>(list, HttpStatus.OK);
			}
		
//		@GetMapping("/getcibil/{pancardNo}/{mobileNO}")
//	public Integer cibilGenerate(@PathVariable Long pancardNo,@PathVariable String mobileNO)
//	{
//			  Random r=new Random();
//				
//			
//			Integer cibil=r.nextInt(999);
//			System.out.println(cibil);
//		
//			
//				return cibil;
//	}
		
		
		
		@GetMapping("/getcibil/{pancardNo}/{mobileNO}")
		public ResponseEntity<Double>getCIBILScore(@PathVariable String panNo)
		{
			int min=600;
			int max=900;
			double a= Math.random()*(max-min+1)+min;
			return new ResponseEntity<Double>(a,HttpStatus.OK);
		}
		
		
		
	
}
