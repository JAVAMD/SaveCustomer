package com.cjc.carloan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.carloan.app.model.VehicalDetails;

@Repository
public interface VehicalDetailsRepositary extends JpaRepository<VehicalDetails, Integer>{

}
