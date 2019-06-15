package com.atguigu.springmvc.handles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.springmvc.entitys.User;

@RequestMapping("/springmvc")
@Controller
public class RequestMappingTest {

	public static final String SUCCESS = "success";
	
	@RequestMapping(value="testModelAndView")
	public ModelAndView testModelAndView(){
		ModelAndView m = new ModelAndView();
		m.setViewName(SUCCESS);
		m.addObject("time",new java.util.Date());
		return m;
		
	}
	
	@RequestMapping(value="/testPojo")
	public String testPojo(User user){
		System.out.println(user);
		return SUCCESS;
	}
	@RequestMapping("/testRequestParams")
	public String testRequestHeader(@CookieValue(value = "JSESSIONID") String session,
			@RequestHeader(value = "Accept-Encoding") String encode,
			@RequestHeader(value = "Accept-Language") String language,
			@RequestParam(value = "username") String username, @RequestParam(value = "password") String password) {
		System.out.println(encode);
		System.out.println(language);
		System.out.println(username);
		System.out.println(password);
		System.out.println(session);
		return SUCCESS;
	}

	// @RequestMapping("/testRequestParams")
	// public String testRequestParams(@RequestParam(value="username") String
	// username,@RequestParam(value="password") String password){
	// System.out.println("testRequestParams");
	// System.out.println(username);
	// System.out.println(password);
	// return SUCCESS;
	// }
	@RequestMapping(value = "/testHiddedMethod/{id}", method = RequestMethod.DELETE)
	public String testHiddenDelete(@PathVariable("id") String id) {
		System.out.println("testHiddenDelete : " + id);
		return SUCCESS;
	}

	@RequestMapping(value = "/testHiddedMethod/{id}", method = RequestMethod.PUT)
	public String testHiddenPut(@PathVariable("id") Integer id) {
		System.out.println("testHiddenPut : " + id);
		return SUCCESS;
	}

	@RequestMapping(value = "/testHiddedMethod/{id}", method = RequestMethod.POST)
	public String testHiddenPost(@PathVariable("id") Integer id) {

		System.out.println("testHiddenPost : " + id);
		return SUCCESS;
	}

	@RequestMapping("/testHiddedMethod/{id}")
	public String testHiddenGet(@PathVariable("id") Integer id) {
		System.out.println("testHiddenGet : " + id);
		return SUCCESS;
	}

	@RequestMapping("/testVariable/{id}")
	public String testVariable(@PathVariable("id") Integer id) {
		System.out.println("testVariable : " + id);

		return SUCCESS;
	}

	@RequestMapping(value = "/testParams", params = { "username", "age!=10" })
	public String testParams() {
		System.out.println("testparams");
		return SUCCESS;
	}

	@RequestMapping("/testMapping")
	public String testMapping() {
		System.out.println("testMapping");
		return "success";
	}
}
