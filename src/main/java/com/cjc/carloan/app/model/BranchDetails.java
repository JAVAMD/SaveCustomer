package com.cjc.carloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class BranchDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer branchId;
	private String branchName;
	private String branchType;
	private Integer branchIfscCode;
	private Integer Microcode;
	private Integer branchCode;
	private String branchContactNo;
	private String branchEmailId;

}
