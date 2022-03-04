package com.example.orderservice.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.orderservice.model.Orders;


@Repository
@Transactional
public interface OrderRepo extends JpaRepository<Orders,Integer>{
	
	@Query("select o from Orders o where o.productname=?1")
	public List<Orders> searchOrdersByProductname(String productname);
	
	@Query("select o from orders o where o.cid=?1")
	public List<Orders> searchCustomersByOrderId(int cid);

}
