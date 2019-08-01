package com.itheima.service.impl;

import java.util.List;

import com.itheima.dao.CustomerDao;
import com.itheima.dao.impl.CustomerDaoImpl;
import com.itheima.domain.Customer;
import com.itheima.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public List<Customer> find(){
		CustomerDao customerDao = new CustomerDaoImpl();
		return customerDao.find();
	}

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		CustomerDao customerDao = new CustomerDaoImpl();
		customerDao.save(customer);
	}
}
