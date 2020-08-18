package com.k8s.test;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	public String getMessage() {
		return "Good Morning!";
	}
}
