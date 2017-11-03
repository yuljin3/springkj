package com.kji.study.sort;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class SortServiceTest {

	@Test
	public void testSort() throws Exception {
		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("aaaa");
		list.add("aaaaaaaa");
		list.add("aa");
		list.add("bbbb");
		list.add("bb");
		
		Collections.sort(list, new TestComparator());
		
		for (String string : list) {
			System.out.println(string);
		}
		
	}
	
}
