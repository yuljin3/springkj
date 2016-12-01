package com.kji.study.annotation.common;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

	enum MY_ENUM{MY_ENUM1, MY_ENUM2, MY_ENUM3, MYENUM4}
	String value() default "defaultString";
	Class<?> myClass() default Void.class;
	MY_ENUM myEnum() default MY_ENUM.MY_ENUM1;
	String[] myStrings();
	MySubAnnotation mySubAnnotation();
}
