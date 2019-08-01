package com.itheima.dao;

import java.util.List;

import com.itheima.domain.Customer;

public interface CustomerDao {

	public List<Customer> find() ;
	public void save(Customer customer);

}
