package spring;

public class AuthInfo {
	private Long num;
	private String id;
	private String email;
	private String name;
	
	public AuthInfo(Long num, String id, String email, String name) {
		this.num = num;
		this.id = id;
		this.email = email;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public Long getNum() {
		return num;
	}
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
}
