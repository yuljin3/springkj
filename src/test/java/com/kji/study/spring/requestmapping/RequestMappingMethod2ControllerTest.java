package com.kji.study.spring.requestmapping;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:spring/application-context.xml", "classpath:spring/servlet-context.xml"})
public class RequestMappingMethod2ControllerTest {

	private MockMvc mockMvc;

	@Autowired
	private RequestMappingMethod2Controller controller;

	@Before
	public void setUp() {
		mockMvc = standaloneSetup(controller).build();
	}

	/**
	 * requestmapping url 을 type level (class, interface) 에서만 선언하고, 
	 * method 레벨에서는 ReqeustMethod.GET, RequestMethod.POST 등만 선언하여도 
	 * url 을 분류 할 수 있다. 
	 */
	@Test
	public void testMethodUri_get() throws Exception {
		mockMvc.perform(get("/user/method")).andExpect(status().isOk()).andExpect(forwardedUrl("getMethod"));
	}

	@Test
	public void testMethodUri_post() throws Exception {
		mockMvc.perform(post("/user/method")).andExpect(status().isOk()).andExpect(forwardedUrl("addMethod"));
	}

}
