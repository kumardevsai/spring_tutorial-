package org.demo.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@RequestMapping("/hello/hello")
	public String greet() {
		
		return "my gree22222222222222";
	}
	
	@RequestMapping("/user/test")
	public String greet1() {
		
		return "my 111111111111111";
	}
	
	@RequestMapping(value="/user/{id}")
	public String myM(@PathVariable("id") int id) {
		
		return "my method" + " " + id;
	}

}
