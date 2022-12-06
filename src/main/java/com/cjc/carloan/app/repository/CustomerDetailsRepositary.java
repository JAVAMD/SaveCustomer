package com.cjc.carloan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.carloan.app.model.CustomerDetails;

@Repository
public interface CustomerDetailsRepositary extends JpaRepository<CustomerDetails, Integer>{

}
