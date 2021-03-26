package spring;

import java.util.Date;

public class Member {
	private Long num;
	private String id;
	private String email;
	private String password;
	private String name;
	private Date regdate;
	
	public Member() {}
	
	public Member(String id, String email, String password, String name,  Date regdate) {
		this.setId(id);
		this.email = email;
		this.password = password;
		this.name = name;
		this.regdate = regdate;
	}
	
	public void setNum(Long num) {
		this.num = num;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	public Long getNum() {
		return num;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getName() {
		return name;
	}
	
	public Date getRegdate() {
		return regdate;
	}
	
	//암호변경 기능을 구현하는 메서드
	public void changPassword(String oldPassword, String newPassword) {
		if(!password.equals(oldPassword))
			throw new IdPasswordNotMatchingException();
		this.password = newPassword;
	}
	
	@Override
	public String toString() {
		return "Member [num=" + num + ", id=" + id + ", email=" + email + ", password=" + password + ", name=" + name + ", regdate="
				+ regdate + "]";
	}
	
	public boolean matchPassword(String pwd) {
		return this.password.equals(pwd);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
