package Board.noticeBoard.domain;

public class Post {
	private long number;
	
	private String title;
	
	private long author;
	
	private long category;
	
	private String body;
	
	private String dateTIme;

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public long getAuthor() {
		return author;
	}

	public void setAuthor(long author) {
		this.author = author;
	}

	public long getCategory() {
		return category;
	}

	public void setCategory(long category) {
		this.category = category;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getDateTIme() {
		return dateTIme;
	}

	public void setDateTIme(String dateTIme) {
		this.dateTIme = dateTIme;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
