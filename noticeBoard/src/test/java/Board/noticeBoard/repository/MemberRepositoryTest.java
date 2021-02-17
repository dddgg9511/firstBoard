package Board.noticeBoard.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import Board.noticeBoard.domain.Member;

@SpringBootTest
public class MemberRepositoryTest {
	@Autowired
	MemberRepository memberRepository;
	
	@Test
	public void SignUpTest() {
		Member member = new Member("choo", "1234", "choo");
		memberRepository.save(member);
	}
}
