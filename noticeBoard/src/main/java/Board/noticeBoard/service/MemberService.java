package Board.noticeBoard.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import Board.noticeBoard.dao.MemberDAO;
import Board.noticeBoard.domain.Member;

@Service 
public class MemberService {
	@Autowired
	MemberDAO memberDAO;
	
	public void signUpMember(Member member) throws Exception {
		Optional<Member> findMember = memberDAO.findById(member.getId());
		findMember.ifPresent(mem -> {
			throw new RuntimeException();
		});
		memberDAO.save(member);
	}
	public void signIn(String id, String password) {
		Optional<Member> findMember = memberDAO.findById(id);
		findMember.ifPresent(mem -> {
			if(mem.getPw() != password)
			{
				throw new RuntimeException();
			}
		});
	}
	
	public void Leave(Member member) {
		
	}
	
	public void update(Member member) {
		
	}
	
}
