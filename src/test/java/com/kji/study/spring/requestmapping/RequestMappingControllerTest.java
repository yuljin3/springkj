package com.kji.study.spring.requestmapping;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
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
public class RequestMappingControllerTest {

	private MockMvc mockMvc;
	
	@Autowired
	private RequestMappingController controller;
	
	@Before
	public void setUp() {
		mockMvc = standaloneSetup(controller).build();
	}
	
	@Test
	public void testController() throws Exception {
		mockMvc.perform(get("/test/sample")).andExpect(status().isOk());
	}
	
	@Test
	public void testController_forward() throws Exception {
		mockMvc
		.perform(get("/test/sample"))
		.andExpect(status().isOk())
		.andExpect(forwardedUrl("success"));
	}
	
	@Test
	public void testController_forward_astar1() throws Exception {
		mockMvc
		.perform(get("/test/viewa"))
		.andExpect(status().isOk())
		.andExpect(forwardedUrl("viewAstar1"));
	}
	
	@Test
	public void testController_forward_astar2() throws Exception {
		mockMvc
		.perform(get("/test/view.a"))
		.andExpect(status().isOk())
		.andExpect(forwardedUrl("viewAstar2"));
	}
	
	@Test
	public void testController_forward_middle_astar() throws Exception {
		mockMvc
		.perform(get("/test/view/aa/user"))
		.andExpect(status().isOk())
		.andExpect(forwardedUrl("viewAstar3"));
	}
	
	@Test
	public void testController_forward_multiple() throws Exception {
		mockMvc
		.perform(get("/test/hello1"))
		.andExpect(status().isOk())
		.andExpect(forwardedUrl("multiple"));
		
		mockMvc
		.perform(get("/test/hello2"))
		.andExpect(status().isOk())
		.andExpect(forwardedUrl("multiple"));
	}
	
	/**
	 * 
	 * RequestMapping에 디폴트 접미어 패턴이 적용된다. 
	 * @RequestMapping({"/sample", "/sample/", "/sample.*"}) 이 경우와 동일한 결과가 나온다.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testController_forward_default() throws Exception {
		mockMvc
		.perform(get("/test/sample"))
		.andExpect(status().isOk())
		.andExpect(forwardedUrl("success"));
		
		mockMvc
		.perform(get("/test/sample/"))
		.andExpect(status().isOk())
		.andExpect(forwardedUrl("success"));
		
		mockMvc
		.perform(get("/test/sample.aaa"))
		.andExpect(status().isOk())
		.andExpect(forwardedUrl("success"));
	}
	
}
