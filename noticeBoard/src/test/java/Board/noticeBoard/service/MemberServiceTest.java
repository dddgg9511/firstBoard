package Board.noticeBoard.service;

import org.junit.jupiter.api.Test;

import Board.noticeBoard.domain.Member;

public class MemberServiceTest {
	MemberService memberService = new MemberService();
	
	@Test
	public void SignUp() {
		Member member = new Member("choo","1234","choo");
		memberService.SingUp(member);
	}
}
