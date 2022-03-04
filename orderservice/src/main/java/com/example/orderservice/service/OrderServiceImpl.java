package com.example.orderservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.orderservice.model.CustomersDto;
import com.example.orderservice.model.Orders;
import com.example.orderservice.repo.OrderRepo;
import com.example.orderservice.service.OrderFeignProxy;
import com.example.orderservice.model.CustomersDto;


@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderRepo repo;
	
	@Autowired
	RestTemplate template;
	
	@Autowired
	OrderFeignProxy proxy;

	@Override
	public String insertOrder(Orders orders) {
		// TODO Auto-generated method stub
repo.save(orders);
	
		return "Order added ";
	}

	@Override
	public List<Orders> displayAllOrders() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String deleteOrder(int ordersId) {
		// TODO Auto-generated method stub
		repo.deleteById(ordersId);
		return "Order deleted";
	}

	@Override
	public List<Orders> searchOrdersByProductname(String productname) {
		// TODO Auto-generated method stub
		return repo.searchOrdersByProductname(productname);
	}

	@Override
	public List<Orders> searchCustomersByOrderId(int cid) {
		// TODO Auto-generated method stub
		return repo.searchCustomersByOrderId(cid);
	}

	@Override
	public List<CustomersDto> searchCustomersByCid(int cid) {
		// TODO Auto-generated method stub
		List<CustomersDto> customers = template.getForObject("http://CUSTOMER-SERVICE/customers/pid/"+cid,List.class);
		return customers;
	}

	
}
	