package api.lang.String2;

public class Member {

	String memberId;
	String memberPw;
	String memberName;
	String memberLevel;
	String memberPoint;
//	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = "^[A-Z0-9]{8,20}";
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$])[A-Z0-9!@#$]{8,15}";
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = "^[가-힣]{2,7}$";
	}
	public String getMemberLevel() {
		return memberLevel;
	}
	public void setMemberLevel(String memberLevel) {
		this.memberLevel = "^(관리자|우수회원|일반회원)$";
	}
	public String getMemberPoint() {
		return memberPoint;
	}
	public void setMemberPoint(String memberPoint) {
		this.memberPoint = "^[1][0][0][1-9]$";
	}
	
	
	Member(String memberId,String memberPw,String memberName,String memberLevel,String memberPoint){
		
		this.setMemberId(memberId);
		this.setMemberPw(memberPw);
		this.setMemberName(memberName);
		this.setMemberLevel(memberLevel);
		this.setMemberPoint(memberPoint);
		
		
	}
	
}
