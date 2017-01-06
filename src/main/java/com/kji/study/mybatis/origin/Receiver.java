package com.kji.study.mybatis.origin;

import lombok.Data;

@Data
public class Receiver {
	private String requestId;
	private Integer mailSequence;
	private String receiveType;
	private String receiveMailAddr;
}
