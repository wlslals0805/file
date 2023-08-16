package com.kh.springhome.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.kh.springhome.interceptor.BoardInterceptor;
import com.kh.springhome.interceptor.BoardOwnerInterceptor;
import com.kh.springhome.interceptor.MemberInterceptor;
import com.kh.springhome.interceptor.TestInterceptor;

/**
	스프링에서 제공하는 설정파일
	- application.properties에서 설정할 수 없는 내용들을 설정하는 파일
	
	만드는 법
	1. 등록(@Configuration)
	2. 필요 시 상속(WebMvcConfigurer)(우리가 만든 게 아니라 원래 있던 것.)
	3. 상황에 맞는 메소드 재정의 및 코드 작성
 */
@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer{
	
	@Autowired
	private TestInterceptor testInterceptor;
	
	@Autowired
	private MemberInterceptor memberInterceptor;
	
	@Autowired
	private BoardInterceptor boardInterceptor;
	
	@Autowired
	private BoardOwnerInterceptor boardOwnerInterceptor;
	
	//addInterceptors=인터셉터를 추가할 수 있는 설정 메소드(registry 저장소에다가 설정)
	//등록 시 주소의 패턴 설정 방법
	//- *이 한 개면 동일한 엔드포인트 내에서만 적용
	//- *이 두 개면 하위 엔드포인트를 포함하여 적용
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//[1] TestInterceptor를 모든 주소=("/**") 처리과정에 간섭할 수 있도록 설정하겠다 
//		registry.addInterceptor(testInterceptor/*인터셉터 객체가 들어올 자리*/)
//		.addPathPatterns("/**"/*간섭하고 싶은 주소를 써넣을 자리*/);
//		(내가 원하는 자리(내가 설정한 주소)에 들어가면 간섭이 실행된다)
		
		//[2] MemberInterceptor를 회원 전용 페이지 처리과정에 간섭할 수 있도록 설정하겠다
		//- addPathPatterns를 사용하면 추가할 주소를 설정할 수 있다.
		//- excludePathPatterns를 사용하면 제외할 주소를 설정할 수 있다.
		registry.addInterceptor(memberInterceptor)
						.addPathPatterns("/member/**","/board/**")
						.excludePathPatterns(
								"/member/join*",
								"/member/login",
								"/member/exitFinish",
								"/board/list",
								"/board/detail*"
								//여기서 막힐지 안 막힐지 결정하는 게 아니라
								//아예 간섭을 할지 말지를 결정. 
								//따라서 제외된 주소들은 그냥 간섭하고 상관이 없다
								//나머지가 출입금지 당하든 허가를 받든 애초에 남일.
								
								//HandlerInterceptor를 상속받는 
								//memberInterceptor 클래스에서 비회원이면 막히게 설정해놓았다
								//.addPathPatterns가 모든 페이지를 포함하고 있기에 
								//본래라면 비회원은 모든 페이지를 못 들어가지만 
								//.excludePathPatterns 덕분에
								///member/join*",
//								"/member/login",
//								"/member/exitFinish",
//								"/board/list",
//								"/board/detail*"
								//위 페이지들은 들어갈 수 있게 되어있다. 간섭을 안 받기 때문!
								
								);
		
//		registry.addInterceptor(boardOwnerInterceptor).addPathPatterns("/board/edit","/board/delete");
		registry.addInterceptor(boardInterceptor).addPathPatterns("/board/edit");
	}
}



