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
@NoArgsConstructor
@AllArgsConstructor 
@Data
public class BankDetails {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bankid;
	private Integer bankAccountNo;
	private String bankAccountHolderName;
	private String Status;
	@OneToOne(cascade = CascadeType.ALL)
    private BranchDetails branchdetails;
}
