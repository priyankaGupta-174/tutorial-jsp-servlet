package priya.login.bean;

public class Member {

	private String uname;
	private String password;
	private String phone;
	private String email;
	
	public Member() {
		super();
	}
	public Member(String uname, String password, String phone, String email) {
		super();
		this.uname = uname;
		this.password = password;
		this.phone = phone;
		this.email = email;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}

