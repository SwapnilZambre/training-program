package com.example.customerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customerservice.model.Customers;
import com.example.customerservice.repo.CustomersRepo;


@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomersRepo repo;

	@Override
	public String insertCustomer(Customers customer) {
		// TODO Auto-generated method stub
		repo.save(customer);
		return "Customer Added";
	}

	@Override
	public List<Customers> displayAllCustomers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		repo.deleteById(cid);
		return "costomer id deleted";
	}

	@Override
	public List<Customers> searchCustomersByCustomerId(String customer) {
		// TODO Auto-generated method stub
		return repo.searchOrdersByCustomer(customer);
	}

	@Override
	public List<Customers> searchCustomersByOrderId(int oid) {
		// TODO Auto-generated method stub
		return repo.searchCustomerByOrderId(oid);
	}

	
	
}