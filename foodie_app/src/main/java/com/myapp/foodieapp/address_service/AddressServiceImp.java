package com.myapp.foodieapp.address_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myapp.foodieapp.model.Address;
import com.myapp.foodieapp.model.User;
import com.myapp.foodieapp.repository.AddressRepository;

import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
public class AddressServiceImp implements AddressInterface {
	
	@Autowired
	private AddressRepository addressRepo;
	
}
