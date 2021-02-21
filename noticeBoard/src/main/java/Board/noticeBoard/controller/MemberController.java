package Board.noticeBoard.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import Board.noticeBoard.domain.Member;
import Board.noticeBoard.service.MemberService;

@RestController
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@PostMapping("/singup")
	public void signUpMember(@RequestBody Member member) throws Exception {
		System.out.println(member.getId());
		System.out.println(member.getName());
		System.out.println(member.getPw());
		memberService.signUpMember(member);
	}
}
