package com.cjc.carloan.app.model;




import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.cjc.carloan.app.model.CibilScore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class EnquiryDetails 
{
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private	Integer customerId;
	private String  firstName;
	private String  lastName;
	private String  email;
	private String  mobileNO;
	private String	pancardNo;
	private Double loanAmount;
	
	@OneToOne(cascade = CascadeType.ALL)
	private CibilScore cibilScore;
	
}
