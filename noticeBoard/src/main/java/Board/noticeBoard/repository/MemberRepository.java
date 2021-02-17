package Board.noticeBoard.repository;

import org.springframework.data.repository.CrudRepository;

import Board.noticeBoard.domain.Member;

public interface MemberRepository extends CrudRepository<Member, String> {}
