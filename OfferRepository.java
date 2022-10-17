package com.gl.caseStudy17102022.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gl.caseStudy17102022.bean.Offer;
@Repository
public interface OfferRepository extends JpaRepository<Offer,Long> {
	//@Query("select * from Offer")
	//public Long findofferplanId();

}
