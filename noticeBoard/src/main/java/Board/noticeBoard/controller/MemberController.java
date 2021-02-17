package Board.noticeBoard.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Board.noticeBoard.domain.Member;
import Board.noticeBoard.service.MemberService;

@RestController
@RequestMapping("/members")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping
	Iterable<Member> findAll(){
		return memberService.findAll();
	}
	
	@PostMapping
	Member SignUp(@PathVariable Member member) {
		Optional<Member> signMember = memberService.SingUp(member);
		if(signMember.isPresent())
			return signMember.get();
		return null;
	}
	
	@PutMapping("/{id}")
	ResponseEntity<Member> updateMember(@PathVariable String id,
										@RequestBody Member member){
		return (memberService.Update(id, member) ? new ResponseEntity<>(member, HttpStatus.CREATED)
				: new ResponseEntity<>(member, HttpStatus.FORBIDDEN));
	}
	
	@DeleteMapping("/{id}")
	void deleteMember(@PathVariable String id) {
		memberService.LeaveMember(id);
	}
	
}
