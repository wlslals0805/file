package oop.inherit3_1;

import java.util.Scanner;

public class Browser {
	
	//필드
		private String url;

		//세터/게터 메소드
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}

		//공통메소드
		public void refresh() {
			System.out.println("페이지 새로고침");
		}
		public void move() {
			System.out.println("페이지 이동");
		}
	
	

}
