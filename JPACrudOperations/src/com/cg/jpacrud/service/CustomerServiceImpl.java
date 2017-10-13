package com.cg.jpacrud.service;

import java.util.List;

import com.cg.jpacrud.dao.CustomerDaoImpl;
import com.cg.jpacrud.dao.ICustomerDao;
import com.cg.jpacrud.entities.Customer;

public class CustomerServiceImpl implements ICustomerService{
	
	private ICustomerDao dao=new CustomerDaoImpl();

	@Override
	public void addCustomer(Customer cust) {
		//dao.beginTransaction();
		dao.addCustomer(cust);
		//dao.commitTransaction();		
	}

	@Override
	public Customer findCustomerById(int cust) {
		return dao.findCustomerById(cust);

	}

	@Override
	public void updateCustomer(Customer cust) {
		dao.updateCustomer(cust);
		
	}

	@Override
	public Customer findCustomerByMobile(String mob) {
		return dao.findCustomerByMobile(mob);
	}

	@Override
	public List<Customer> getDetails() {
		return dao.getDetails();
	}

	@Override
	public long getCount() {
		return dao.getCount();
	}

	
	/*
	@Override
	public void removeCustomer(Customer cust) {
		dao.beginTransaction();
		dao.removeCustomer(cust);
		dao.commitTransaction();		
	}
*/

}
