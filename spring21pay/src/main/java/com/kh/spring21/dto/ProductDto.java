package com.kh.spring21.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class ProductDto {
	
	private int productNo;
	private String productName;
	private int productPrice;

}
