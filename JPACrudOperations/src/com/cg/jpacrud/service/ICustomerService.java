package com.cg.jpacrud.service;

import java.util.List;

import com.cg.jpacrud.entities.Customer;

public interface ICustomerService {

	//void removeCustomer(Customer cust);

	void addCustomer(Customer cust);

	Customer findCustomerById(int i);

	void updateCustomer(Customer cust);

	Customer findCustomerByMobile(String string);

	List<Customer> getDetails();

	long getCount();


}
