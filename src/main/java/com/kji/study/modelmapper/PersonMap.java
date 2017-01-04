package com.kji.study.modelmapper;

import org.modelmapper.PropertyMap;

public class PersonMap extends PropertyMap<Person, PersonDTO>{

	@Override
	protected void configure() {
		map().setCity(source.getAddress().getStreet());
		map(source.getAddress().getCity(), destination.street);
	}

}
