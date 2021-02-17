package Board.noticeBoard.service;

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
	
	public Iterable<Post> getList(){
		return repository.findAll();
	}
	
	public Optional<Post> findByID(Long postNumber) {
		return repository.findById(postNumber);
	}
	
	public Post save(Post post) {
		return repository.save(post);
	}
	
	public Post update(Post post){
		return repository.save(post);
	}
	
	public void delete(Long postNumber) {
		repository.deleteById(postNumber);
	}
}
