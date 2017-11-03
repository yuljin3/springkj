package com.kji.study.javaenum;

import lombok.Getter;


@Getter
public enum TestEnum {

	CUSTOMER1("kji"),
	CUSTOMER2("ssh");
	
	private String customerName;
	
	TestEnum(String customerName) {
		this.customerName = customerName;
	}

	public void log() {
		System.out.println(name() + ":" + getCustomerName());
	}

	public void getAge() {
		switch (this) {
			case CUSTOMER1:
				System.out.println("35");
				break;
			case CUSTOMER2:
				System.out.println("36");
				break;
			default:
				break;
		}
	}
	
}
