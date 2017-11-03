package com.kji.study.lombok;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestFile {

	@Test(expected=NullPointerException.class)
	public void testName() throws Exception {
		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add(null);
		
		list.stream().forEach(x -> {System.out.println(x.toString());});
	}
	
	
}
