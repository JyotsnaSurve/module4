package com.cg.jpacrud.dao;

import java.util.List;

import com.cg.jpacrud.entities.Customer;

public interface ICustomerDao {



	public void addCustomer(Customer cust);

	public Customer findCustomerById(int cust);

	public void updateCustomer(Customer cust);

	public Customer findCustomerByMobile(String mob);

	public List<Customer> getDetails();

	public long getCount();

	//void commitTransaction();

	//void removeCustomer(Customer cust);

//	void beginTransaction();

}
