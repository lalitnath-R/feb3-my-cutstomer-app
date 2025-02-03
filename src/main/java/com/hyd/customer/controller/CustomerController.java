package com.hyd.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hyd.customer.entity.Customer;


@RestController
public class CustomerController {
	@Autowired
	Customer cusSer;
	
	
	@PostMapping("/Customer/data/hello/all")
	
	public  String addNewcustomer(@RequestBody List<Customer>cusData) {
		cusSer.saveCustomerNewRecord(cusData);
		
		return ("successfully added new customer------>");
		
	}}