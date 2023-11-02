package com.kh.spring21.vo;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
//@JsonIgnoreProperties(ignoreUnknown = true)
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class KakaoPayDetailResponseVO {
	
	private String tid,cid,sid; //결제고유번호/가맹점
	private String status; 		//결제 상태
	private String partnerOrderId,partnerUserId;
	private String paymentMethodType;	//결제수단(CARD/MONEY)
	private KakaoPayAmountVO amount,cancelAmount,cancelAvailableAmount;
	private String itemName,itemCod;	//상품명/코드
	private int quantity; 				//수량
	private Date createdAt,approvedAt,canceledAt;	//준비/승인 시각
	private KakaoPaySelectedCardInfoVO selectedCardInfo;
	private List<KakaoPaymentActionDetailVO> paymentActionDetails;
	
}
