package com.ghfkd1235.spring.ex.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller	
public class HelloController {

	@GetMapping("/hello")
	@ResponseBody
	public String helloWorld() {
		return "hello world";
	}
}