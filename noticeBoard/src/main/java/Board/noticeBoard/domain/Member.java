package Board.noticeBoard.domain;



public class Member {
	
	private String id;		//id have to be unique
	private String pw;		//
	private String name;	//name can have duplication
	
	public Member() {}
	public Member(String id, String name, String pw) {
		this.id = id;
		this.name = name;
		this.pw = pw;
	}
	public String getId() {
		return this.id;
		}
	public void setId(String id) {
		this.id = id;
		}
	
	public String getPw() {return this.pw;}
	public void setPw(String pw) {this.pw = pw;}
	
	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}
	
}
