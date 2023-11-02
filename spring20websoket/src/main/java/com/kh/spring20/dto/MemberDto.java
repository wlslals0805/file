package com.kh.spring20.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class MemberDto {
	
	private String memberId;
	private String memberPw;
	private String memberNickname;
	private String memberEmail;
	private int memberContact;
	private String memberBirth;
	private int memberPost;
	private String memberAddr1;
	private String memberAddr2;
	private String memberLevel;
	private int memberPoint;
	private String memberJoin;
	private String memberLogin;
	private String memberChange;

}
