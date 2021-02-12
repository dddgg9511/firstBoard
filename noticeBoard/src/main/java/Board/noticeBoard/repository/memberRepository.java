package Board.noticeBoard.repository;

import Board.noticeBoard.domain.Member;

public interface memberRepository {
	public void join(Member member);
	public void leave(Member member);
	
	public Member findById(long id);
	public Member findByName(String name);
	
	public Member findAll();
	
}
