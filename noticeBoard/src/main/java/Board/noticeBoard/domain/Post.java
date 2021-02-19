package Board.noticeBoard.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
	private long number;
	
	private String title;
	
	private long author;
	
	private long category;
	
	private String body;
	
	private String dateTIme;
}
