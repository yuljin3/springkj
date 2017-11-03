package com.kji.study.javaenum;

import org.junit.Test;

public class TestEnumTest {

	@Test
	public void testEnum() throws Exception {
		TestEnum.CUSTOMER1.log();
		
		TestEnum.CUSTOMER1.getAge();
		
		System.out.println(TestEnum.values());
	}
	
	@Test
	public void testName() throws Exception {
		
		TestEnum[] enumList =  TestEnum.values();
		
		for (TestEnum testEnum : enumList) {
			testEnum.log();
		}
		
	}

	@Test
	public void testName2() throws Exception {
		ConvertUtils.convertUtils(TestEnum.class);
	}
	
}
