package jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.BoardDto;
import jdbc.dto.MemberDto;
import jdbc.mapper.MemberMapper;
import jdbc.util.JdbcUtils;

public class MemberDao {
	
	public void insert(MemberDto dto) {
		
		String sql ="insert into Member(member_id,member_pw,member_nickname,"
				+ "member_birth,member_email,member_contact"
				+ ") values(?,?,?,?,?,?)";
		
		Object[] data= {
				dto.getMemberId(),dto.getMemberPw(),dto.getMemberNickname(),
				dto.getMemberBirth(),dto.getMemberEmail(),dto.getMemberContact(),
				};
		
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
 		jdbcTemplate.update(sql, data);
		
		
		
		}
		
	
	
	
	//비밀번호 변경 기능
	//-1.기존 비밀번호와 신규 비밀번호를 입력받아 검사 후 변경(권장하진 않음)
	//-2.임시 비밀번호 변경하는 기능
	//-3.아이디에 맞는 계정의 비밀번호를 변경하는 기능
	
	
	//public boolean updateMemberPassword(MemberDto dto,String newPw){//1
	//public boolean updateMemberPassword(String memberId){//2
	//public boolean updateMemberPassword(String memberId,String member){
	
	public boolean updateMemberPassword(MemberDto dto) {
		String sql = "update member set member_pw=? where member_id=?";
		
		Object[] data = {
				dto.getMemberPw(),dto.getMemberId()
		};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		int result = jdbcTemplate.update(sql, data);
		
		return result > 0;
	
		
	}
	
	public boolean updateMemberInfo(MemberDto dto) {
		String sql = "update member set member_nickname=?,member_contact=?,"
				+ "member_email=?,member_birth=? where member_id=?";
		
		Object[] data = {dto.getMemberNickname(),dto.getMemberContact(),
				dto.getMemberEmail(),dto.getMemberBirth(),dto.getMemberId()
		};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		int result = jdbcTemplate.update(sql, data);
		
		return result>0;
		
		
		
		
		
	}
	
	public boolean delete(String memberId) {
			String sql = "delete member where member_id=?";
			Object[] data = {memberId};
			
			JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
			
			int result  = jdbcTemplate.update(sql,data);
			
			
			return result>0;
			
			
			
		}
		
	private MemberMapper mapper = new MemberMapper();
	public List<MemberDto> selectList(){

		
			String sql = "select * from member";
			JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
//			List<PocketmonDto> list = jdbcTemplate.query(sql, mapper);
//			return list;
			return jdbcTemplate.query(sql, mapper);
		}
	
	public List<MemberDto> selectListByPage(int page) {
		int end = page * 10;
		int begin = end - 9;
		
		String sql = "select * from ("
							+ "select rownum rn, TMP.* from("
								+ "select * from member order by member_id desc"
							+ ")TMP"
						+ ") where rn between ? and ?";
		Object[] data = {begin, end};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.query(sql, mapper, data);
	}
	
	public MemberDto selectOne(String memberId) {
		String sql = "select * from Member where member_id=?";
		Object[] data = {memberId};
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		List<MemberDto> list = jdbcTemplate.query(sql, mapper ,data);

		
		return list.isEmpty() ? null : list.get(0);
	
	}
	
	
	
	
	
	
	}
	
	


