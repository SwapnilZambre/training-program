
	package com.example.orderservice.service;


	import java.util.List;

	import com.example.orderservice.model.CustomersDto;
	import com.example.orderservice.model.Orders;

	public interface OrderService  {
		
		public String insertOrder(Orders order);
		 public List<Orders> displayAllOrders();
		 public String deleteOrder(int oid);
		 public List<Orders> searchOrdersByProductname(String productname );
		 public List<Orders> searchCustomersByOrderId(int cid);
		 public List<CustomersDto> searchCustomersByCid(int cid);

	

}
