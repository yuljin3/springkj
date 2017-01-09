package com.kji.study.lombok;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
public class LombokBuildDomain {
	private String id;
	private String name;
	private String extraField;

	@Builder
	private LombokBuildDomain(@NonNull String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Builder(builderMethodName = "cbuilder", buildMethodName = "add")
	private LombokBuildDomain(String id, String name, String extraField) {
		this.id = id;
		this.name = name;
		this.extraField = extraField;
	}

}
