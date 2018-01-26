package com.bis.nj.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bis.nj.model.Buildings;
import com.bis.nj.model.LandLordDetails;

@Repository
public interface LandLordDao extends JpaRepository<LandLordDetails, Integer> {


}
