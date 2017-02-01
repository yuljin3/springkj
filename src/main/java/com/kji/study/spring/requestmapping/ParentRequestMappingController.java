package com.kji.study.spring.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/parent")
@Controller("parentRequestMappingController")
public class ParentRequestMappingController {

	@RequestMapping("/list1")
	public String list1() {
		return "parentList1";
	}

	@RequestMapping("/list2")
	public String list2() {
		return "parentList2";
	}

}
