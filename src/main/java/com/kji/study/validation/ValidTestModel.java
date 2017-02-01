package com.kji.study.validation;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ValidTestModel {
	@NotNull
	private String id;
	private String name;
}
