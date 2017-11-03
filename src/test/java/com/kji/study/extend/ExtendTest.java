package com.kji.study.extend;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExtendTest {

	@Test
	public void testExtends_1() throws Exception {
		Parent parent = new Child();
		//Child  child = new Parent(); extend의 역관계는 성립 불가 
		
		Child child = new Child();
		child.setChildFiled1("test1");
		child.setChildFiled2("test2");
		
		parent = child;
		
		System.out.println(parent);
		
	}	
	
	@Test
	public void testExtends_2() throws Exception {
		Parent parent = new Parent();
		//Child  child = new Parent(); extend의 역관계는 성립 불가 
		
		Child child = new Child();
		child.setChildFiled1("test1");
		child.setChildFiled2("test2");
		
		parent = child;
		
		System.out.println(parent);
		
	}
	
	@Test
	public void tesExtends_3() throws Exception {
//		Parent parent = new Parent();
//		parent.setParentFiled1("test1");
//		
//		Child child = (Child)parent;
//		System.out.println(child);
		
//		Object object = new Object();
//		
//		String abc = (String)object;
//		System.out.println(abc);
		
		String abcd = "abc";
		Object abcdo = (Object)abcd;
		String abcd2 = (String)abcdo;
		
		System.out.println(abcd2);
		
	}
	
}
