package com.kh.spring17.vo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class MemberComplexSearchVO {
	
	private String memberId;
	private String memberNickname;
	private String memberEmail;
	private Integer memberContact;
	private Integer memberPost;
	private String birthBegin;
	private String birthEnd;
	private List<String> memberLevelList;
	private Integer pointMin;
	private Integer pointMax;
	private List<String> orderList;
	private Integer begin;
	private Integer end;

}
