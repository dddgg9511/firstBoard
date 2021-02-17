package Board.noticeBoard.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Board.noticeBoard.domain.Member;
import Board.noticeBoard.repository.MemberRepository;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository memberRepository;
	
	public Iterable<Member> findAll(){
		return memberRepository.findAll();
	}
	
	public Optional<Member> findByID(String id){
		return memberRepository.findById(id);
	}
	
	public Optional<Member> SingUp(Member member) {
		if(memberRepository.existsById(member.getId())) {
			return null;
		}
		else {
			return Optional.ofNullable(memberRepository.save(member));
		}
	}
	
	public Boolean Update(String id, Member member) {
		if(memberRepository.existsById(id)) {
			memberRepository.save(member);
			return true;
		}
		return false;
	}
	
	public Boolean SignIn(String id, String pw) {
		Optional<Member> member = memberRepository.findById(id);
		if(!member.isPresent()) {
			return false;
		}
		if(member.get().getPw().equals(pw)) {
			return true;
		}
		return false;
	}
	
	public Boolean LeaveMember(String id) {
		if(memberRepository.existsById(id))
		{
			memberRepository.deleteById(id);
			return true;
		}
		return false;
	}
}
