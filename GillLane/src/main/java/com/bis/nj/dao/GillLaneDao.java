package com.bis.nj.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bis.nj.model.Details;

@Repository
public interface GillLaneDao extends JpaRepository<Details, Integer> {

}
