package com.cjc.carloan.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CustomerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer customerId;
	private String customerName;
	private String customerMobileno;
	private String customerEmailId;
	private String customerGender;
	private String customerDob;
	private Integer customerAge;
	private String incomeDetails;
	private String occupationType;
	private String loanType;
	private String Status;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bankdetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAddress customeraddress;
	
	@OneToOne(cascade = CascadeType.ALL)
	private DocumentDetails documentdetails;
	
	@OneToOne(cascade = CascadeType.ALL)
	private VehicalDetails vehicaldetails;

}
