package jdbc.app;

import java.sql.Date;

import jdbc.dao.ProductDao;
import jdbc.dto.ProductDto;

public class Test05 {

	public static void main(String[] args) {
		
		ProductDao dao = new ProductDao();
		ProductDto dto=new ProductDto();
		
		
		dto.setName("우유맛쿠키");
		dto.setType("과자");
		dto.setPrice(1000);
		dto.setMade(Date.valueOf("2020-02-01"));	//문자열 ->Date
		dto.setExpire(Date.valueOf("2020-03-01"));	//문자열 ->Date
	
		dao.insert(dto);
		
		System.out.println("등록완료");
		
		
		
		
	}

}
