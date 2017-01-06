package com.kji.study.mybatis.origin;

public interface ReceiverMapper {

	Receiver selectDetailReceives(String requestId);

	Receiver selectDetailReceiveHandler(String requestId);

	ReceiverAssosiation selectDetailReceivAssociation(String requestId);
}
