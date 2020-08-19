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

	public String test(String str, Integer value, Float amount) {
		if (str != null) {
			System.out.println("String not null.");
		}
		System.out.println("Hello" + "Jai Shri RAM" + "Jai Bhole Shankar" + "Jai Sambhu Baba mere Bhole nath" + str);
		System.out.println("Bug Fixed");
		System.out.println("Jai Ganesh! " + "Happy Ganesh Chatuthi");
		System.out.println("Hello" + "Jai Shri RAM" + "Jai Bhole Shankar");
		return str;
	}

	public static Integer addFuture1(int i, int j) {
		return i + j;
	}
}
