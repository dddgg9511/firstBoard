package Board.noticeBoard.domain;

public class Member {
	
	private String id;		//id have to be unique
	private String pw;		//
	private String name;	//name can have duplication
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
