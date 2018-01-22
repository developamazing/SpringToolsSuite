package com.bis.nj.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bis.nj.model.Buildings;

@Repository
public interface BuildingDao extends JpaRepository<Buildings, Integer> {

}
