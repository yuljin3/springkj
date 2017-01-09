package com.kji.study.spring.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/test")
public class RequestMappingController {

	@RequestMapping("/sample")
	public String sample() {
		return "success";
	}

	@RequestMapping("/view*")
	public String viewAstar1() {
		return "viewAstar1";
	}

	@RequestMapping("/view.*")
	public String viewAstar2() {
		return "viewAstar2";
	}

	@RequestMapping("/view/**/user")
	public String viewMiddelAstar() {
		return "viewAstar3";
	}

	@RequestMapping({"/hello1", "/hello2"})
	public String multiple() {
		return "multiple";
	}

}
