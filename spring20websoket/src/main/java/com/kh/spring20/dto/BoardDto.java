package com.kh.spring20.dto;

import lombok.Data;

@Data
public class BoardDto {
	
	private int boardNo;
	private String memberId;
	private String boardContent;
}
