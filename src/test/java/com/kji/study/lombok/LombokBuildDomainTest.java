package com.kji.study.lombok;

import org.junit.Test;

public class LombokBuildDomainTest {

	@Test
	public void testBuilder_default() throws Exception {
		LombokBuildDomain domain = LombokBuildDomain.builder().id("testId").name("testName").build();
		System.out.println(domain);
	}

	@Test(expected = NullPointerException.class)
	public void testBuilder_nonnull() throws Exception {
		LombokBuildDomain domain = LombokBuildDomain.builder().build();
		System.out.println(domain);
	}

	@Test
	public void testBuilder_customName() throws Exception {
		LombokBuildDomain domain = LombokBuildDomain.cbuilder().id("ctestId").name("ctestName").add();
		System.out.println(domain);
	}

}
