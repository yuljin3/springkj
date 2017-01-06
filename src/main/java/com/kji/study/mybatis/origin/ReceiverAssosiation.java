package com.kji.study.mybatis.origin;

import lombok.Data;

@Data
public class ReceiverAssosiation {

	private String requestId;
	private Integer mailSequence;
	private String receiveType;
	private String receiveMailAddr;

	public ReceiverAssosiation(String requestId, Integer mailSequence) {
		this.requestId = requestId;
		this.mailSequence = mailSequence;
	}

}
