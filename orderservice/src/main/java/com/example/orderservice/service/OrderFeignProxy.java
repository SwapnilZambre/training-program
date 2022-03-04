package com.example.orderservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.orderservice.model.CustomersDto;

@FeignClient(name="customer-service", url="http://localhost:8082/")
public interface OrderFeignProxy {
	
	@GetMapping("customers/cid/{cid}")
	public List<CustomersDto> findCustomersByCid(@PathVariable int cid);

}