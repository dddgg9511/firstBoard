package Board.noticeBoard.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Member {
	
	@Id 
	@GeneratedValue
	private String id;		//id have to be unique
	private String pw;		//
	private String name;	//name can have duplication
	
	public Member(String id, String pw, String name){
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
}
