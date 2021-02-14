package Board.noticeBoard.domain;

public class Member {
	
	
	private long number;	//number is database key
	private String id;		//id have to be unique
	private String pw;		//
	private String name;	//name can have duplication
	
	Member(long number, String id, String pw, String name){
		this.number = number;
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
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
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
}
