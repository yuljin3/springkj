package com.kji.study.spring.container;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstantiatingContainerTest {

	
	/*
	 * xml파일을 통한 ApplicationContext 초기화
	 * 
	 * ClassPathXmlApplicationContext 사용
	 */
	@Test
	public void testInstantiatingContainer() throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"services.xml", "daos.xml"});
		PetStoreService service = (PetStoreServiceImpl)context.getBean("petStore");
		System.out.println(service.getPet());
		
	}
	
	@Test
	public void testInstantiatingContainer_getBean() throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:/services.xml", "classpath:/daos.xml"});
		PetStoreService service = (PetStoreServiceImpl)context.getBean("petStore", PetStoreService.class);
		System.out.println(service.getPet());
		
	}
	
	/*
	 * relative path is possible, but not recommended.
	 * 절대 경로를 모두 적는 것을 추천한다. 
	 */
	@Test
	public void testInstantiatingContainer_fully_qualified_resouce() throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:/services.xml", "classpath:/daos.xml"});
		PetStoreService service = (PetStoreServiceImpl)context.getBean("petStore");
		System.out.println(service.getPet());
		
	}
	
	/**
	 * xml 파일에 resource 를 import 하여 여러 xml 파일로 부터 bean객체를 생성하는 테스트
	 * 
	 * @throws Exception
	 */
	@Test
	public void testInstantiatingContainer_xml_import() throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		PetStoreService service = (PetStoreServiceImpl)context.getBean("petStore");
		System.out.println(service.getPet());

	}
	
}
