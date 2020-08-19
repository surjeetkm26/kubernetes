package com.k8s.test;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Future1Controller {

	public String sayHello() {
		System.out.println("Hello");
		return "say futureOne";
	}
}
