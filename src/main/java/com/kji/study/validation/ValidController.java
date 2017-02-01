package com.kji.study.validation;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/valid")
@RestController
public class ValidController {

	@RequestMapping("/test")
	public ValidTestModel validation(@Valid ValidTestModel model) {
		return model;
	}
	
}
