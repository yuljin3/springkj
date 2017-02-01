package com.kji.study.spring.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/method")
public class RequestMappingMethodController {

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addGet() {
		return "addGet";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addPost() {
		return "addPost";
	}

	@RequestMapping(value = "/type", params = "type=admin")
	public String typeAdmin() {
		return "typeAdmin";
	}

	@RequestMapping(value = "/type", params = "type=member")
	public String typeMember() {
		return "typeMember";
	}

	@RequestMapping("/type")
	public String type() {
		return "typeNormal";
	}

	@RequestMapping(value = "/param", params = "param=yes")
	public String typeNotParamYes() {
		return "paramYes";
	}

	@RequestMapping(value = "/param", params = "param=no")
	public String typeNotParamNo() {
		return "paramNo";
	}

	@RequestMapping(value = "/param", params = "!param")
	public String typeNotParam() {
		return "notParam";
	}

	@RequestMapping(value = "/header", headers = "content-type=text/*")
	public String headerFilterUrl() {
		return "headerFilterd";
	}
}
