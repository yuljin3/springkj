package com.kji.study.spring.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("child")
@Controller("childRequestMappingController")
public class ChildRequestMappingController extends ParentRequestMappingController {

	@RequestMapping("/list2")
	@Override
	public String list2() {
		return "childList2";
	}

}
