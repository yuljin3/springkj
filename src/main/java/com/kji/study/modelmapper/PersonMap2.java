package com.kji.study.modelmapper;

import org.modelmapper.AbstractProvider;
import org.modelmapper.PropertyMap;
import org.modelmapper.Provider;

public class PersonMap2 extends PropertyMap<Person, PersonDTO>{

	@Override
	protected void configure() {
		map(source.getAddress().getCity(), destination.street);
		
		Provider<String> addressProvider = new AbstractProvider<String>() {
			@Override
			protected String get() {
				return "providerSTring";
			}
		};

		with(addressProvider).map().setCity(source.getAddress().getStreet());
	}

}
