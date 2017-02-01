package com.kji.study.spring.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/user/method")
@Controller
public class RequestMappingMethod2Controller {

	@RequestMapping(method = RequestMethod.GET)
	public String getMethod() {
		return "getMethod";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String addMethod() {
		return "addMethod";
	}

}
