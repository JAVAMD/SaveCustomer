package com.cjc.carloan.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor 
@Data
public class CustomerAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	private String houseNo;
	private String buildingNo;
	private String laneName;
	private String areaName;
	private String landmark;
	private String cityName;
	private String stateName;
	private String countryName;
	private Integer pincode;
	
	

}
