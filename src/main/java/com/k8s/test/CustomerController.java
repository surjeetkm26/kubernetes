package com.k8s.test;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	public String getMessage() {
		System.out.println("Hello Welcome dude");
		return "Good Morning!";
	}
	public String getCustomerMessage() {
		System.out.println("Hello Welcome dude");
		return "Good Morning!";
	}
	public void test() {
		System.out.println("Hello");
	}
}
