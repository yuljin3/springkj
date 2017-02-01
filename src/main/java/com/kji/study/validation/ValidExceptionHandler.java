package com.kji.study.validation;

import javax.servlet.http.HttpServletRequest;

import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ValidExceptionHandler {

	@ExceptionHandler(BindException.class)
	public void handel(BindException exception, HttpServletRequest request, BindingResult result) {
		result.hasErrors();
	}
}
