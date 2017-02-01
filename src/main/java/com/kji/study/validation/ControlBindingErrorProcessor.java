package com.kji.study.validation;

import org.springframework.beans.PropertyAccessException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DefaultBindingErrorProcessor;

public class ControlBindingErrorProcessor extends DefaultBindingErrorProcessor {

	@Override
	protected Object[] getArgumentsForBindError(String objectName, String field) {
		
		System.out.println(field);
		
		return super.getArgumentsForBindError(objectName, field);
	}

	@Override
	public void processPropertyAccessException(PropertyAccessException ex, BindingResult bindingResult) {
		
		System.out.println("걸린다");
		
		super.processPropertyAccessException(ex, bindingResult);
	}
	
	
	
}
