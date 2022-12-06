package com.cjc.carloan.app.servicei;

import java.util.List;

import com.cjc.carloan.app.model.EnquiryDetails;

public interface EnquiryService 
{
	public EnquiryDetails createEnquiry(EnquiryDetails enquiryDetail);
	
	
	public List<EnquiryDetails> displayEnquiry();
}
