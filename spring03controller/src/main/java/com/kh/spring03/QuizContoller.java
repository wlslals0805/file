package com.kh.spring03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping("/lotto-list2")
	public /*List<Integer>*/String lottoList(){
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i<45;i++) {
			list.add(i);
			
		}
	
		
		Collections.shuffle(list);
		
		
		return	"로또 번호 리스트:" + list.subList(0, 6);
		
}
	
	//(추가)스프링은 역할을 명시하는 것을 선호한다
	//-@RequesrParam을 변수 앞에 붙여 파라미터임을 표시
	@RequestMapping("/square")
	public String square(@RequestParam int one) {
		
		int result = one*one;
		
		return "입력한 수의 제곱은:" + result;

	}
	
	
	
	//(추가) 연도가 주어지지 않으면 실행을 안 할 건가?
	//-파라미터가 없어도 실행되어야 하는 상황(ex:기본값)
	//-만약 birth가 제공되지 않는다면 성인 요금을 부여
	//-@RequestParam에 required = false옵션을 주면 없어도 됨
	//-@RequestParam에 defaultValue를 설정하여 기본값을 지정(문자열)
	
	@RequestMapping("/subway")
	public String subway(
			@RequestParam(required = false, defaultValue = "2000") int birth) {
		
//		구분	기준	요금
//		어르신	65세 이상	무료
//		성인	20세 이상 65세 미만	1250원
//		청소년	14세 이상 20세 미만	720원
//		어린이	8세 이상 14세 미만	450원
//		영유아	8세 미만	무료

		int present = LocalDate.now().getYear();
		int age = present - birth+1;
		String result = "";
		int price;
		if(age>=65) {
			result = "어르신";
			price= 0;
		}
		else if(age>=20) {
			result = "성인";
			price = 1250;
		}
		else if(age>=14) {
			result = "청소년";
			price = 720;
		}
		else if(age>=8) {
			result = "어린이";
			price = 450;
		}
		else {
			result = "영유아";
			price = 0;
		}
		
		return result+"입니다. 요금은 "+price+"원입니다.";
		
		
	}
	
	@RequestMapping("/leap")
	public String leap(@RequestParam int year) {
		if(year%4==0&&year%100!=0||year%400==0) {
			return "윤년입니다";
		}
		else { return "윤년이 아닙니다.";}	
	}
	
	@RequestMapping("/circle")
	public String circle(@RequestParam float radius) {
		
		return "원의 넓이는:"+(radius*radius)*3.14;
		
	}
	

}
