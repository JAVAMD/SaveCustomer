package com.cjc.carloan.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.carloan.app.model.EnquiryDetails;
import com.cjc.carloan.app.repository.EnquiryRepository;
import com.cjc.carloan.app.servicei.EnquiryService;

@Service
public class EnquiryServiceImpl implements EnquiryService 
{
	  @Autowired
	  private EnquiryRepository er;

	@Override
	public EnquiryDetails createEnquiry(EnquiryDetails enquiryDetail) 
	{
		return er.save(enquiryDetail);
	
	}

	@Override
	public List<EnquiryDetails> displayEnquiry() 
	{
		return er.findAll();
	}
	

}
