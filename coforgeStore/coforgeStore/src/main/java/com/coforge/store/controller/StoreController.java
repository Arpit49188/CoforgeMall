package com.coforge.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.store.model.StoreDetails;
import com.coforge.store.repository.StoreDetailsRepository;

@RestController
@RequestMapping("/api/v1")
public class StoreController {
	@Autowired
	private StoreDetailsRepository storeRepository;
	
	@GetMapping("/stores")
	public List<StoreDetails> getAllStores(){
		return storeRepository.findAll();
		
	}
//	@PostMapping("/stores")
//	public List<StoreDetails> getAllStores(){
//		return storeRepository.findAl();
//		
//	}

}
