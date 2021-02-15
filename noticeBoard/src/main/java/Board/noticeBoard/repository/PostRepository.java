package Board.noticeBoard.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;


import Board.noticeBoard.domain.Post;

@Repository
public interface PostRepository {
	
	List<Post> findAll();
	
	Optional<Post> findByID(int postNumber);
	
	long save(Post post);
	
	Boolean update(Post post);
	
	Boolean deleteByID(int postNumber);
}
