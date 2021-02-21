package Board.noticeBoard.domain;



public class Member {
	
	private String member_id;		//id have to be unique
	private String member_password;		//
	private String member_name;	//name can have duplication
	
	public Member() {}
	public Member(String id, String name, String pw) {
		this.member_id = id;
		this.member_name = name;
		this.member_password = pw;
	}
	public String getId() {
		return this.member_id;
		}
	public void setId(String id) {
		this.member_id = id;
		}
	
	public String getPw() {return this.member_password;}
	public void setPw(String pw) {this.member_password = pw;}
	
	public String getName() {return this.member_name;}
	public void setName(String name) {this.member_name = name;}
	
}
