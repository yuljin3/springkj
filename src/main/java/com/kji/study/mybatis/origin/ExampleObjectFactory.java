package com.kji.study.mybatis.origin;

import java.util.List;
import java.util.Properties;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

@SuppressWarnings("serial")
public class ExampleObjectFactory extends DefaultObjectFactory {

	@Override
	public <T> T create(Class<T> type) {
		return super.create(type);
	}

	@Override
	public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
		return super.create(type, constructorArgTypes, constructorArgs);
	}

	@Override
	public void setProperties(Properties properties) {
		super.setProperties(properties);
	}

	@Override
	public <T> boolean isCollection(Class<T> type) {
		return super.isCollection(type);
	}

}
