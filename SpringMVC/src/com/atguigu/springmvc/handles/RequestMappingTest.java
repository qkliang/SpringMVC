package com.atguigu.springmvc.handles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/springmvc")
@Controller
public class RequestMappingTest {
	
	@RequestMapping("/testMapping")
	public String testMapping(){
		System.out.println("testMapping");
		return "success";
	}
}
