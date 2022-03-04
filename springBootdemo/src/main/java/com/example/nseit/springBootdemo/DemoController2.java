package com.example.nseit.springBootdemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController2 {
	
	@Autowired
	@Qualifier("r")
	Shape shape;
	@GetMapping("/test1")
	public String test3() {
	return shape.showShape();
	
}
@GetMapping("/test2")
public String test4() {
return "response from test4";
}

}