package com.kh.spring20.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class ReplyDto {
	
	String memberId;
	int originNo;
	String replyContent;

}
