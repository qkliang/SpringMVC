package com.atguigu.springmvc.handles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping("/springmvc")
@Controller
public class RequestMappingTest {
	
	public static final String SUCCESS = "success";
	
	@RequestMapping(value="/testHiddedMethod/{id}",method=RequestMethod.DELETE)
	public String testHiddenDelete(@PathVariable("id") String id){
		System.out.println("testHiddenDelete : " + id);
		return SUCCESS;
	}
	
	@RequestMapping(value = "/testHiddedMethod/{id}",method = RequestMethod.PUT)
	public String testHiddenPut(@PathVariable("id") Integer id){
		System.out.println("testHiddenPut : " + id);
		return SUCCESS;
	}
	
	@RequestMapping(value = "/testHiddedMethod/{id}",method = RequestMethod.POST)
	public String testHiddenPost(@PathVariable("id") Integer id){
		
		System.out.println("testHiddenPost : " + id);
		return SUCCESS;
	}
	
	@RequestMapping("/testHiddedMethod/{id}")
	public String testHiddenGet(@PathVariable("id") Integer id){
		System.out.println("testHiddenGet : " + id);
		return SUCCESS;
	}
	
	
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
