package Board.noticeBoard.domain;

import lombok.Data;

@Data
public class Post {
	private long number;
	
	private String title;
	
	private long author;
	
	private long category;
	
	private String body;
	
	private String dateTIme;

	
}
