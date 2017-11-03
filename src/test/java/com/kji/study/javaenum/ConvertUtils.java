package com.kji.study.javaenum;

public class ConvertUtils {

	public static <E extends Enum<E>> CodeValue convertUtils(Class<E> enumType) {
		
		for (Enum<E> enumVal: enumType.getEnumConstants()) {  
			
		}  
		
		//return CodeValue.builder().code(name()).value(getValue()).build();
		return null;
	}
	
}
