package api.lang.String2;

public class Member {

//	회원 가입 프로그램
//
//	Member라는 클래스를 만들고 다음 정보를 보관할 수 있도록 구현합니다.
//
//	회원아이디(memberId) - 8~20자 알파벳+숫자 로 구성
//	회원비밀번호(memberPw) - 8~15자 알파벳+숫자+특수문자 반드시 포함하여 구성
//	회원이름(memberName) - 한국인 이름
//	회원등급(memberLevel) - 관리자 / 우수회원 / 일반회원 중 하나로 설정, 기본값은 일반회원
//	회원포인트(memberPoint) - 최초 100점을 부여, 0 이상만 가능
//	Scanner를 통해서 가입에 필요한 정보를 입력받아 객체를 생성하고 출력
//	단, 비밀번호는 첫 글자를 제외한 나머지 마스킹 처리하여 출력
	

	String memberId;
	String memberPw;
	String memberName;
	String memberLevel;
	int memberPoint;
//	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		if(memberId.matches("^[A-Za-z0-9]{8,20}$")){
		this.memberId = "아이디:" + memberId;}
		else {this.memberId="아이디: 승인불가";}
		 
	}
		
	public String getMemberPw() {
		
		int count = memberPw.length();
		String star = "*";
		return	memberPw.charAt(0)+memberPw.replace(memberPw,star.repeat(count-1));
		
	}
	public void setMemberPw(String memberPw) {
if(memberPw.matches("^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z0-9!@#$]{8,15}$")) {
	this.memberPw = memberPw;}
}
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		if(memberName.matches("^[가-힣]{2,7}$")) {
		this.memberName = memberName;}
		else {this.memberName="이름 승인불가";}
	}
	public String getMemberLevel() {
		return memberLevel;
	}
	public void setMemberLevel(String memberLevel) {
		if(memberLevel.matches("^(관리자|우수회원|일반회원)$")) {
		this.memberLevel = memberLevel;}
		else {this.memberLevel="일반회원";}
	}
	public int getMemberPoint() {
		
		return this.memberPoint+100;
	}
	public void setMemberPoint(int memberPoint) {
		
		if(memberPoint>0) {
		this.memberPoint=memberPoint;}
		
		
	}
	
	
	Member(String memberId,String memberPw,String memberName,String memberLevel,int memberPoint){
		
		this.setMemberId(memberId);
		this.setMemberPw(memberPw);
		this.setMemberName(memberName);
		this.setMemberLevel(memberLevel);
		this.setMemberPoint(memberPoint);
		
	
}
		
		
		void show(){
			
			
			System.out.println(memberId);
		
			System.out.println("비밀번호:" + this.getMemberPw());
			
			System.out.println("이름:" + this.memberName);
			
			System.out.println("회원등급:"+this.memberLevel);
			
			System.out.println("회원 포인트:"+getMemberPoint());
			
			
			
			
				
		
	
	
}
	
}
