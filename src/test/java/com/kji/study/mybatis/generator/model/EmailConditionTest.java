package com.kji.study.mybatis.generator.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmailConditionTest {
	
	@Test
	public void testName() throws Exception {
		
		EmailCondition example = new EmailCondition();
		example.createCriteria().andRequestIdEqualTo("request");		
	}
	
}
