package com.kji.study.annotation.defaultValue;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.junit.Test;
/**
 * 
 * Annotation 의 default value 테스트
 * 
 **/
public class AnnotationDefaultValueTest {

	@Test
	public void testStringDefaultValue() throws Exception {
		AnnotationDefaultValueTest ob = new AnnotationDefaultValueTest();
		try {
			Method method = ob.getClass().getMethod("publicTestMethod");
			Annotation[] annos = method.getAnnotations();
			for (Annotation annotation : annos) {
				System.out.println(annotation);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * 	DefaultAnnotaion 중 privateTestMethod에는 value가 changed text, 100 값으로 출력되어야 한다.
	 *	 
	 */
	@Test
	public void testStringDefaultValue2() throws Exception {
		try {
			Method method = AnnotationDefaultValueTest.class.getDeclaredMethod("privateTestMethod");
			method.setAccessible(true);
			Annotation[] annos = method.getAnnotations();
			for (Annotation annotation : annos) {
				System.out.println(annotation);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@DefaultAnnotation(intValue = 100)
	public void publicTestMethod() {
	}
	
	@DefaultAnnotation(value="changed text", intValue = 100)
	private void privateTestMethod() {
	}
	
}
