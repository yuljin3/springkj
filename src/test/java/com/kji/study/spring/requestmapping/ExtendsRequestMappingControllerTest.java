package com.kji.study.spring.requestmapping;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring/application-context.xml", "classpath:spring/servlet-context.xml"})
public class ExtendsRequestMappingControllerTest {

	private MockMvc mockMvc;

	private MockMvc cmockMvc;

	@Autowired
	@Qualifier("parentRequestMappingController")
	private ParentRequestMappingController pcontroller;

	@Autowired
	@Qualifier("childRequestMappingController")
	private ChildRequestMappingController ccontroller;

	@Before
	public void setUp() {
		mockMvc = standaloneSetup(pcontroller).build();
		cmockMvc = standaloneSetup(ccontroller).build();
	}

	@Test
	public void tesParentList() throws Exception {
		mockMvc.perform(get("/parent/list1")).andExpect(status().isOk()).andExpect(forwardedUrl("parentList1"));
	}

	@Test
	public void testChildList_no_override() throws Exception {
		cmockMvc.perform(get("/child/list1")).andExpect(status().isOk()).andExpect(forwardedUrl("parentList1"));
	}

	@Test
	public void testChildList_override() throws Exception {
		cmockMvc.perform(get("/child/list2")).andExpect(status().isOk()).andExpect(forwardedUrl("childList2"));
	}

}
