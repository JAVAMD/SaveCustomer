package com.cjc.carloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DocumentDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer documentId;
	private String customerId;
	private Byte[] uidCopy;
	private Byte[] bankPassBookCopy;
	private Byte[] itrFile;
	private Byte[] photoRentCopy;
	private Byte[] pdcCheck;
	private Byte[] Signature;
	private Byte[] cancelledCheck;
	private Byte[] panCopy;
	private Byte[] salarySlip;
	private String uidNo;
	private String panNo;

}
