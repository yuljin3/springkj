package com.kji.study.annotation.common;

import static org.junit.Assert.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * @author kj
 *
 *
 *
 */
public class MyAnnotationTest {

	
	/*
	 * 모든 annnotaion 설정 값 전달 
	 */
	@MyAnnotation(value="value"
		, myClass=MyClass.class
		, myEnum= MyAnnotation.MY_ENUM.MY_ENUM3
		, myStrings={"MyString1","MyString2","MyString3"}
		, mySubAnnotation = @MySubAnnotation(value1="value1",value2="value2")
	)
	public static void allValueMethod() {
	}
	
	/*
	 * annotation 설정값 중 default value 지정 된 메소드는 설정에서 제외하고 전달 
	 */
	@MyAnnotation(value="value"
		, myClass=MyClass2.class
		, myStrings={"MyString1","MyString2","MyString3"}
		, mySubAnnotation = @MySubAnnotation
	)
	@SuppressWarnings("fallthrough")
	public static void excludeDefaultValueMethod() {
	}
	
	/*
	 * 단일 메소드만 가지고 있는 annotation은 키값을 제거하고 value값만 전달해도 사용가능
	 */
	@MySingleAnnotaion("single value")
	public static void singleMethodAnnotationMethod() {
	}

	@Test
	public void testSingleMethodAnnotation() throws Exception {
		printAnnotaionValue("singleMethodAnnotationMethod");
	}

	@Test
	public void testExcludeDefaultValueMethod() throws Exception {
		printAnnotaionValue("excludeDefaultValueMethod");
	}

	@Test
	public void testAllValueMethod() throws Exception {
		printAnnotaionValue("allValueMethod");
	}
	
	/*
	 * annotation 타입별로 분리해서 처리하는로직 테스트 
	 */
	@Test
	public void testAnnotationType() throws Exception {
		printAnnotaionValueWithoutSubAnnotation();
	}
	
	private void printAnnotaionValue(String methodName) {
		try {
			Method method = MyAnnotationTest.class.getDeclaredMethod(methodName);
			Annotation[] annos = method.getAnnotations();
			for (Annotation annotation : annos) {
				System.out.println(annotation);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void printAnnotaionValueWithoutSubAnnotation () {
		try {
			Method methods[] = MyAnnotationTest.class.getDeclaredMethods();
			for (Method method : methods) {
				Annotation[] annotations = method.getAnnotations();
				for (Annotation annotation : annotations) {
					if (annotation instanceof MyAnnotation) {
						System.out.println(annotation);
					} else if (annotation instanceof Test) {
						System.out.println("이것은 test annotation입니다.");
					} else {
						System.out.println("기타 : " + annotation);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testName() throws Exception {
		Class<MyAnnotationTest> cs = MyAnnotationTest.class;
		Method[] methods = cs.getDeclaredMethods();
		
		for (Method method : methods) {
			MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
			
			if (myAnnotation != null) {
				System.out.println(method.getName());
				MyClass myClass = (MyClass)myAnnotation.myClass().newInstance();
				myClass.runProcess();
			}
		}
		
	}
	
}
