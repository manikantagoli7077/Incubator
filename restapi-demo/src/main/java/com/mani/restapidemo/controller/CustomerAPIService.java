package com.mani.restapidemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mani.restapidemo.model.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerAPIService {
	
	Customer customer;
	
	@GetMapping("{custId}")
	public Customer getCustomerDetails(String custId) {
		return customer;
//				new Customer("C1","Vendor 1","Address one","xxxxx");
		
	}
	
	@PostMapping
	public String createCustomerDetails(@RequestBody Customer customer)
	{
		this.customer=customer;
		return "Customer Created Successfully";
	}
	
	@PutMapping
	public String updateCustomerDetails(@RequestBody Customer customer)
	{
		this.customer=customer;
		return "Customer updated Successfully";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCustomerDetails(@RequestBody Customer customer)
	{
		this.customer=null;
		return "Customer Deleted Successfully";
	}
	
}
