package com.kji.study.spring.requestmapping;

import java.util.List;

public class GenericController<T, K, S> {
	S service;
	T body;
	List<T> list;

	public void add(T entity) {
	};

	public void update(T entity) {
	};

	public T view(K id) {
		return body;
	};

	public void delete(K id) {

	}

	public List<T> list() {
		return list;
	}

}
