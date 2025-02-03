package com.hyd.customer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hyd.customer.entity.Customer;


public interface CustomerRepo  extends JpaRepository<Customer, Integer> {

}
