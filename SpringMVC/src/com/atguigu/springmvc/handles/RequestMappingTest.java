package com.atguigu.springmvc.handles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/springmvc")
@Controller
public class RequestMappingTest {
	
	public static final String SUCCESS = "success";
	
	@RequestMapping("/testVariable/{id}")
	public String testVariable(@PathVariable("id") Integer id){
		System.out.println("testVariable : "  + id);
		
		return SUCCESS;
	}
	@RequestMapping(value="/testParams",
			params={"username","age!=10"})
	public String testParams(){
		System.out.println("testparams");
		return SUCCESS;
	}
	@RequestMapping("/testMapping")
	public String testMapping(){
		System.out.println("testMapping");
		return "success";
	}
}
