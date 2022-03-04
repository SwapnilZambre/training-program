package com.example.nseit.springBootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class DemoController1 {
	@RestController
	@RequestMapping("/controller1")
	public class DemoController 
	{
		@GetMapping("/test1")
		public String test1() 
		{
			return "response from test1";
		}
		
		@GetMapping("/test2")
		public String test2() 
		{
			return "response from test2";
		}

		// localhost:8080/controller1/test1
		//localhost:8080/controller2/test1

	}
}
