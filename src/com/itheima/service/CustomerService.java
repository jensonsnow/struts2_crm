package com.itheima.service;

import java.util.List;

import com.itheima.domain.Customer;

public interface CustomerService {
	
	public List<Customer> find();
	public void save(Customer customer);

}
