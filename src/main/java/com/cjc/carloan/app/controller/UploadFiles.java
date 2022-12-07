package com.cjc.carloan.app.controller;

import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;


//import com.cjc.carloan.app.model.CustomerDetails;
//import com.cjc.carloan.app.servicei.UploadFilesService;

//public class UploadFiles {
	
//	UploadFilesService sf;
	
	
//	@PostMapping(value="/saveCustomer",consumes = MediaType.ALL_VALUE)
//	public ResponseEntity<CustomerDetails > saveDocuments(
//	@RequestPart (value="addressProof",required = true)	MultipartFile file1,
//	@RequestPart (value="panCard",required = true)MultipartFile file2,
//	@RequestPart (value="incomeTax",required = true)MultipartFile file3,
//	@RequestPart (value="addharCard",required = true)MultipartFile file4,
//	@RequestPart (value="photo",required = true)MultipartFile file5,
//	@RequestPart (value="bankCheque",required = true)MultipartFile file6,
//	@RequestPart (value="salarySlips",required = true)MultipartFile file7)throws IOException{
//		CustomerDetails  cus1= new CustomerDetails();
//		
//		UploadFiles pd=new UploadFiles();
//		            pd.saveDocuments(file1, file2, file3, file4, file5, file6, file7);
//		         return   sf.uploadfiles(pd);
//		           ;
//                    
//	}

//  }
