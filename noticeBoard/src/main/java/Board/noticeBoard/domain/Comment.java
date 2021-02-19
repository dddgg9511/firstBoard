package Board.noticeBoard.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
	private long id;
	
	private long author;
	
	private String text;
	
	private String dateTime;
}
