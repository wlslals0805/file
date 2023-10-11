package com.kh.springhome.dto;

import lombok.Data;

//POJO 클래스
//= Plain Old Java Object
//= Spring에 등록하지 않아도 됨

@Data	//@Setter+@Getter+@ToString+@EqualsAndHashCode
//@Setter @Getter @NoArgsConstructor @ToString
public class PocketmonDto {
	
	
	private int no;
	private String name;
	private String type;
	private boolean image;//이미지유무 = DB 미포함

	
	
	

}
