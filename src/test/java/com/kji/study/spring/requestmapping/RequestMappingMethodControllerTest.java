package com.kji.study.spring.requestmapping;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
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
public class RequestMappingMethodControllerTest {

	private MockMvc mockMvc;

	@Autowired
	private RequestMappingMethodController controller;

	@Before
	public void setUp() {
		mockMvc = standaloneSetup(controller).build();
	}

	@Test
	public void testGetMethod() throws Exception {
		mockMvc.perform(get("/method/add")).andExpect(status().isOk()).andExpect(forwardedUrl("addGet"));
	}

	@Test
	public void testPostMethod() throws Exception {
		mockMvc.perform(post("/method/add")).andExpect(status().isOk()).andExpect(forwardedUrl("addPost"));
	}

	/**
	 * 지정되지 않은 method 로 호출 시 405 (not allowed)에러 발생. 
	 */
	@Test
	public void testInvalidMethod_notAllowed() throws Exception {
		mockMvc.perform(delete("/method/add")).andExpect(status().isMethodNotAllowed());
	}

	/**
	 * parmas에 따라 동일한 URL도 분리하여 사용 할 수 있다.
	 */
	@Test
	public void testParams() throws Exception {
		mockMvc.perform(get("/method/type?type=admin")).andExpect(status().isOk()).andExpect(forwardedUrl("typeAdmin"));
		mockMvc.perform(get("/method/type?type=member")).andExpect(status().isOk()).andExpect(forwardedUrl("typeMember"));
		mockMvc.perform(get("/method/type")).andExpect(status().isOk()).andExpect(forwardedUrl("typeNormal"));
	}

	/**
	 * param url의 경우 param 변수로 들어오는 값에 따라 
	 * yes(param=yes) , no(param=no) , param이 존재하지 않는 경우(!param)로 리턴 페이지가 결정된다.   
	 */
	@Test
	public void testParams2() throws Exception {
		mockMvc.perform(get("/method/param?param=yes")).andExpect(status().isOk()).andExpect(forwardedUrl("paramYes"));
		mockMvc.perform(get("/method/param?param=no")).andExpect(status().isOk()).andExpect(forwardedUrl("paramNo"));
		mockMvc.perform(get("/method/param?noParam=1")).andExpect(status().isOk()).andExpect(forwardedUrl("notParam"));
	}

	/**
	 * header에 값을 확인하여 해당 header 값이 존재 할 때만 url 맵핑  
	 **/
	@Test
	public void testHeader() throws Exception {
		mockMvc.perform(get("/method/header").header("content-type", "text/*")).andExpect(status().isOk()).andExpect(forwardedUrl("headerFilterd"));
	}

}
