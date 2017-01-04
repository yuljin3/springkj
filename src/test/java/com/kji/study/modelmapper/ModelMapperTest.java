package com.kji.study.modelmapper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.modelmapper.ModelMapper;

public class ModelMapperTest {

	ModelMapper modelMapper;
	
	@Before
	public void setUp() {
		 modelMapper = new ModelMapper();
	}
	
	@Test
	public void testModelMapper() throws Exception {
		
		Name name = new Name();
		name.setFirstName("kim");
		name.setLastName("jeongin");
		
		Customer customer = new Customer();
		customer.setName(name);
		
		Address address = new Address();
		address.setCity("Incheon");
		address.setStreet("Cristal");

		Order order = new Order();
		order.setCustomer(customer);
		order.setBillingAddressIncheonasdf(address);
		
		OrderDTO orderDTO = modelMapper.map(order, OrderDTO.class);
		System.out.println(orderDTO);
		
	}
	
	@Test
	public void testValidatingMatches() throws Exception {
		modelMapper.createTypeMap(Order.class, OrderDTO.class);
		modelMapper.validate();
	}
	
	/**
	 * PropertyMap을 상속받아 destination model로의 맵핑 규칙을 변경 할 수 있다.  
	 */
	@Test
	public void testPropertyMap() throws Exception {
		modelMapper.addMappings(new PersonMap());

		Address address = new Address();
		address.setCity("Incheon");
		address.setStreet("Cristal");

		Person person = new Person();
		person.setAddress(address);
		
		PersonDTO pessonDTO = modelMapper.map(person, PersonDTO.class);
	
		//city 와 street가 바뀌어서 나오는것을 확인 할 수 있다.
		System.out.println(pessonDTO);
		
	}
	
	/**
	 * propertyMap에 providertest  
	 */
	@Test
	public void testProvider() throws Exception {
		modelMapper.addMappings(new PersonMap2());

		Address address = new Address();
		address.setCity("Incheon");
		address.setStreet("Cristal");

		Person person = new Person();
		person.setAddress(address);
		
		PersonDTO pessonDTO = modelMapper.map(person, PersonDTO.class);
	
		//city가 provider에 지정한 값으로 나오는것을볼 수 있다. 
		System.out.println(pessonDTO);
		
	}
	
}
