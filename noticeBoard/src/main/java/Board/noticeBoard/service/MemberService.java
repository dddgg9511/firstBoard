package Board.noticeBoard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Board.noticeBoard.dao.MemberDAO;
import Board.noticeBoard.domain.Member;

@Service 
public class MemberService {
	@Autowired
	MemberDAO memberDAO;
	
	public void signUpMember(Member member) throws Exception{
		memberDAO.save(member);
	}
}
