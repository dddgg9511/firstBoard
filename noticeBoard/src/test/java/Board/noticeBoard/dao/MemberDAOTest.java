package Board.noticeBoard.dao;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;
import Board.noticeBoard.domain.Member;

@SpringBootTest
public class MemberDAOTest {
	@Autowired
	MemberDAO memberDAO;
	
	@AfterEach
	public void AfterEach() {
		memberDAO.deleteAll();
	}
	
	@Test
	public void saveAndGet() {
		//give
		String id = "choo";
		String name = "choo";
		String pw = "1234";
		Member member = new Member(id, name, pw);
		
		memberDAO.save(member);
		//when
		Optional<Member> memberFind = memberDAO.findById(id);
		
		//then
		if(memberFind.isPresent()) {
			assertThat(memberFind.get()).isEqualTo(member);
			System.out.println(member);
		}
	}
	
	@Test
	public void count() {
		String id = "choo";
		
		for(int i = 1; i < 10; i++) {
			Member member = new Member(id + i, "choo", "1234");
			memberDAO.save(member);
			int count = memberDAO.count();
			System.out.println(count);
			assertThat(count == i).isTrue();
		}
	}
	
	@Test
	public void findAll() {
		Member[] members = new Member[3];
		String id = "choo";
		for(int i = 0; i < 3; i++) {
			members[i] = new Member(id + i, "choo", "1234");
			memberDAO.save(members[i]);
		}
		List<Member> memberList = memberDAO.findAll();
		assertThat(memberList.size()).isEqualTo(3);
		memberList.forEach(m -> assertThat(m).isEqualTo(members[memberList.indexOf(m)]));
	}
	
	
	@Test
	public void update() {
		Member member = new Member("choo", "choo", "1234");
		memberDAO.save(member);
		
		member.setName("updateName");
		
		memberDAO.update(member);
		
		memberDAO.findById(member.getId()).ifPresent(m -> {
			assertThat(m.getName()).isEqualTo("updateName");
		});
	}
}
