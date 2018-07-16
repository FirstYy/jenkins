
package com.itmayiedu.contoller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 @EnableAutoConfiguration
public class HelloConttoller {

	@RequestMapping("/hello2")
	public String hello2() {
//        int i1 = 1/0;
		return "hello2";
	}

	 public static void main(String[] args) {
	 SpringApplication.run(HelloConttoller.class, args);
	 }

	@RequestMapping("/test2")
	public String test2() {
		int i = 1 / 0;
		System.out.println();
		return "test2";
	}
}
