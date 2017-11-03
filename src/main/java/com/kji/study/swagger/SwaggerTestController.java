package com.kji.study.swagger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/sw")
public class SwaggerTestController {

	@RequestMapping(value="/sample", method = RequestMethod.POST)
	public String sample() {
		return "success";
	}
	
}
