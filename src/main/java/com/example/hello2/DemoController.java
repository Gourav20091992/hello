package com.example.hello2;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DemoController {
	
	@Autowired
	ARepo a;
	
	@GetMapping("/get")
	public A testMethod() {
		
		Optional<A> byId = a.findById(1);
		
		System.out.println(byId.get());
		return byId.get();
	}
	
	@GetMapping("/test")
	public String testMethod1() {
		
		System.out.println("hello ");
		return "hello";
	}
	
	

}
