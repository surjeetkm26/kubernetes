package com.k8s.test;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Future1Controller {

	public String sayHello() {
		return "say futureOne";
	}
}
