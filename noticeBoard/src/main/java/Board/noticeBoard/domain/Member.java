package Board.noticeBoard.domain;



public class Member {
	private String member_id;		
	private String member_name;	
	private String member_password;
	
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
	
	@Override
	public String toString() {
		return "Member [member_id=" + member_id + ", member_password=" + member_password + ", member_name="
				+ member_name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((member_id == null) ? 0 : member_id.hashCode());
		result = prime * result + ((member_name == null) ? 0 : member_name.hashCode());
		result = prime * result + ((member_password == null) ? 0 : member_password.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (member_id == null) {
			if (other.member_id != null)
				return false;
		} else if (!member_id.equals(other.member_id))
			return false;
		if (member_name == null) {
			if (other.member_name != null)
				return false;
		} else if (!member_name.equals(other.member_name))
			return false;
		if (member_password == null) {
			if (other.member_password != null)
				return false;
		} else if (!member_password.equals(other.member_password))
			return false;
		return true;
	}
	
	
}
