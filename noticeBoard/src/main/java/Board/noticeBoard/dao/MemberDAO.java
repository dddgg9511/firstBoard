package Board.noticeBoard.dao;



import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import Board.noticeBoard.domain.Member;

@Mapper
@Repository
public interface MemberDAO extends CrudDAO<Member, String>{
}
