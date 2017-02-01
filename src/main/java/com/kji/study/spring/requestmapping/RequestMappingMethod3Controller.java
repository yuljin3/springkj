package com.kji.study.spring.requestmapping;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/method3/*")
public class RequestMappingMethod3Controller {

	@RequestMapping
	public String get() {
		return "getMethod3";
	}

	@RequestMapping
	public String add() {
		return "addMethod3";
	}
}
