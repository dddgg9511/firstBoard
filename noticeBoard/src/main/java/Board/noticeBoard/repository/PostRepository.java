package Board.noticeBoard.repository;


import org.springframework.data.repository.CrudRepository;

import Board.noticeBoard.domain.Post;

public interface PostRepository extends CrudRepository<Post, Long>{}
