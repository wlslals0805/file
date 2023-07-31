package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.MemberDto;
import jdbc.mapper.MemberMapper;
import jdbc.util.JdbcUtils;

public class Test05 {

			public static void main(String[] args) {
				

				String sql ="select * from member order by member_id asc";

				
				MemberMapper mapper = new MemberMapper();
				
				JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
						
				List<MemberDto> list =jdbcTemplate.query(sql, mapper);
				
				
				if(list.isEmpty()) {
					
					System.out.println("존재하지 않는 도서");
				}
				
				else {
				System.out.println("조회 결과 수 :"+list.size());
				for(MemberDto dto : list) {
					System.out.println(dto);	//dto.toString()
				}
				
				}
				
				
			

		
			}}
		
		
		
		
		
	


