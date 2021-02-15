package Board.noticeBoard.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import Board.noticeBoard.domain.Post;
import Board.noticeBoard.repository.PostRepository;

@Service
public class PostService 
{
	@Autowired
	private PostRepository repository;
	
	public List<Post> getList(){
		return repository.findAll();
	}
	
	public Optional<Post> findByID(int postNumber) {
		return repository.findByID(postNumber);
	}
	
	public long save(Post post) {
		return repository.save(post);
	}
	
	public Boolean update(Post post) {
		return repository.update(post);
	}
	
	public Boolean delete(int postNumber) {
		return repository.deleteByID(postNumber);
	}
}
