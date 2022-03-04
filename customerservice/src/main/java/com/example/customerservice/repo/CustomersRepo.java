package com.example.customerservice.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.customerservice.model.Customers;

@Repository
@Transactional

public interface CustomersRepo extends JpaRepository<Customers,Integer>{
	
	
	@Query("select c from Customers c where c.cname=?1")
	public List<Customers> searchOrdersByCustomer(String customer);
	
	@Query("select c from Customers c where c.cid=?1")
	public List<Customers> searchCustomerByOrderId(int oid);

}
