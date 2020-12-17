package net.kh.member.run;

import net.kh.member.run.model.Member;

public class Run {
	/**
	 * 의존관계
	 * Run ----> Member
	 * 사용클래스 ----> 피사용클래스
	 */
	public static void main(String[] args) {
		Member m = new Member();
		m.setMemberId("gogo");
		m.setMemberName("고길동");
		m.setMemberPwd("gogo1234");
		m.setAge(22);
		m.setGender('남');
		m.setPhone("01012341234");
		m.setEmail("gogo@email.com");
		m.isMarried(true);
		String memberInfo = "아이디 : " + m.getMemberId()+"\n"
						  + "이름 : " 	+ m.getMemberName()+"\n"
						  + "이름 : " 	+ m.getMemberPwd()+"\n"
						  + "나이 : " 	+ m.getAge()+"\n"
						  + "성별 : " 	+ m.getGender()+"\n"
						  +"전화번호 : "+ m.getPhone()+"\n"
						  +"이메일 : " 	+ m.getEmail() + "\n"
						  + "결혼 여부 : " + m.isMarried();
		System.out.println(memberInfo);
	}
}
