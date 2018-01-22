package com.bis.nj.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bis.nj.model.ApartmentStatus;

@Repository
public interface ApartmentStatusDao  extends JpaRepository<ApartmentStatus, Integer> {

}
