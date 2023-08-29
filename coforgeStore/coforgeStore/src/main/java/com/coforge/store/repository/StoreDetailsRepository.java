package com.coforge.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.coforge.store.model.StoreDetails;
@Repository
public interface StoreDetailsRepository extends JpaRepository<StoreDetails,Long> {
	
	

}
