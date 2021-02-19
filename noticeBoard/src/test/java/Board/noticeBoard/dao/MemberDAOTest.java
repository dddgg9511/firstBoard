package Board.noticeBoard.dao;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import Board.noticeBoard.domain.Member;

@SpringBootTest
public class MemberDAOTest {
	MemberDAO memberDAO;
	
	@Test
	public void save() {
		Member member = new Member();
		member.setName("choo");
		member.setId("choo");
		member.setPw("1234");
		memberDAO.save(member);
	}
	
}
