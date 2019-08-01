package com.itheima.web.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.itheima.domain.Customer;
import com.itheima.service.CustomerService;
import com.itheima.service.impl.CustomerServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{
	
	private Customer customer = new Customer();
	
	@Override
	public Customer getModel() {
		// TODO Auto-generated method stub
		return customer;
	}
	
	public String find() {
		CustomerService  customerService = new CustomerServiceImpl();
		List<Customer> list = customerService.find();
		ServletActionContext.getRequest().setAttribute("list",list);
		return "findSuccess";
	}
	
	
	
	public String saveUI() {
		return "saveUI";
	}
	
	
	public String save() {
		CustomerService  customerService = new CustomerServiceImpl();
		customerService.save(customer);
		return "saveSuccess";
	}


}
