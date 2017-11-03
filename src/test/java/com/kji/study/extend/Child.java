package com.kji.study.extend;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper=false)
@ToString
public class Child extends Parent {
	private String childFiled1;
	private String childFiled2;
	
}
