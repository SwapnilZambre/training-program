
	package com.example.customerservice.controller;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	import com.example.customerservice.model.Customers;
	import com.example.customerservice.service.CustomerService;


	@RestController
	@RequestMapping("/customers")
	public class CustomersController {
		
		@Autowired
		CustomerService service;
		
		@GetMapping("/all")
		public List<Customers> showAll(){
			return service.displayAllCustomers();
		}
		
		@PostMapping("/add")
		public String addCustomer(@RequestBody Customers customer) {
			return service.insertCustomer(customer);
		}
		
		@DeleteMapping("/delete/{cid}")
		public String deletecustomer(@PathVariable("cid") int cid) {
			return service.deleteCustomer(cid);
		}
		
		@GetMapping("/customer/{cname}")
		public List<Customers> searchByCustomer(@PathVariable("cname") String customer) {
				return service.searchCustomersByCustomerId(customer);
		}
		
		@GetMapping("/oid/{oid}")
		public List<Customers> searchByOid(@PathVariable("oid") int oid) {
				return service.searchCustomersByOrderId(oid);
		}


	}

