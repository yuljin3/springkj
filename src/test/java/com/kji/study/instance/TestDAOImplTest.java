package com.kji.study.instance;

import org.junit.Test;

public class TestDAOImplTest {

	@Test
	public void testName() throws Exception {
		TestDAOImpl dao = new TestDAOImpl();
		TestDAO dao2 = new TestDAOImpl();
		
		if (dao instanceof TestDAO) {
			System.out.println("dao is TestDAO");
		}
		
		if (dao2 instanceof TestDAOImpl) {
			System.out.println("dao2 is TestDAOImpl");
		}
		
	}
	
}
