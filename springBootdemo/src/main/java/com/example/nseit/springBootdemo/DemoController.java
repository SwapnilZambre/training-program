package com.example.nseit.springBootdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller1")
public class DemoController {
@Value("${myname}")
String name;
@Value("${server.port}")
int port;
@Value("${config1.databaseName}")
String dname;
@Value("${config1.databaseDriver}")
String ddriver;
@GetMapping("/port")
public String port() {
return "Application is running on port:"+port;
}

@GetMapping("/test1")
public String test1() {
return "response from test1::"+name;
}
@GetMapping("/test2")
public String test2() {
return "response from test2";
}
@GetMapping("/details")
public Configuration showConfigDetails() {
return new Configuration(ddriver,dname);
}

// localhost:8080/controller1/test1
//localhost:8080/controller2/test1
}