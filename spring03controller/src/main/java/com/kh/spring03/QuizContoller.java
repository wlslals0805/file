package com.kh.spring03;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController	//애노테이션(Annotation) - 역할 정의
public class QuizContoller {
	
	Random r = new Random();
	
	@RequestMapping("/dice")
	public String dice(){
		
		int dice= r.nextInt(6)+1;
		
		return "주사위: "+dice;

	}
	@RequestMapping("/lotto")
	public String lotto() {
		
		int lotto = r.nextInt(45)+1;
		
		return "로또 번호:" + lotto;
	}
	

}
