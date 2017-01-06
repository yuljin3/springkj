package com.kji.study.mybatis.origin;

import org.apache.ibatis.annotations.Select;

public interface ReceiverJavaMapper {

	@Select("SELECT  request_id as requestId, mail_seq as mailSequence, receive_mail_address as receiveMailAddr		, receive_type_code as receiveType	FROM email_receive_201612	WHERE request_id = #{requestId}	and mail_seq = 0")
	Receiver selectDetailReceives(String requestId);

}
