package com.cg.jpacrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.jpacrud.entities.Customer;

public class CustomerDaoImpl implements ICustomerDao{

	private EntityManager em;

	public CustomerDaoImpl() {
		em = JPAUtil.getEntityManager();
	}

/*	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}
*/
	@Override
	public void addCustomer(Customer cust) {
		em.getTransaction().begin();
		em.persist(cust);
		em.getTransaction().commit();
		System.out.println("values are inserted");
		
	}
/*
	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}*/

	@Override
	public Customer findCustomerById(int cust) {
		return em.find(Customer.class, cust);
	}

	@Override
	public void updateCustomer(Customer cust) {
		em.merge(cust);		
	}

	@Override
	public Customer findCustomerByMobile(String mob) {

		String str="Select c from Customer c where mob=:mobno";
		TypedQuery<Customer> query = em.createQuery(str,Customer.class);
		query.setParameter("mobno", mob);
		Customer cust = query.getSingleResult();
		return cust;
	}

	@Override
	public List<Customer> getDetails() {
		String str="select c from Customer c";
		TypedQuery<Customer> query=em.createQuery(str,Customer.class);
		List<Customer> custList=query.getResultList();
		return custList;
	}

	@Override
	public long getCount() {
		String str="select count(c) from Customer c";
		TypedQuery<Long> query=em.createQuery(str,Long.class);
		long count=query.getSingleResult();
		return count;
	}

	/*

	@Override
	public void removeCustomer(Customer cust) {
		em.remove(cust);
	}
	 */

}
