package Board.noticeBoard.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Board.noticeBoard.domain.Post;
import Board.noticeBoard.service.PostService;

@RestController
@RequestMapping("/post")
public class PostController {
	@Autowired
	private PostService postService;
	
	@GetMapping
	public List<Post> getList(){
		return postService.getList();
	}
	
	@GetMapping("/{postNumber}")
	public Optional<Post> findByID(Long postNumber) {
		return postService.findByID(postNumber);
	}
	
	public long save(Post post) {
		return postService.save(post);
	}
	
	public Boolean update(Post post) {
		return postService.update(post);
	}
	
	public Boolean delete(Long postNumber) {
		return postService.delete(postNumber);
	}
}
