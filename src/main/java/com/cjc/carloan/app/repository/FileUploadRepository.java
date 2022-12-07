package com.cjc.carloan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.carloan.app.model.BankDetails;

public interface FileUploadRepository extends JpaRepository<BankDetails, Integer>{

}
