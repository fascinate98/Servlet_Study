package model.vo;

public class MemberVO {
	
	private int mem_idnum;
	private String mem_id;
	private String mem_password;
	private String mem_name;
	private String mem_email;
	private String mem_company;
	private int mem_isadmin;
	
	public MemberVO() {}
	
	public MemberVO(String id, String pw, String name, String email, String company, boolean isadmin) {
		this.mem_id = id;
		this.mem_password = pw;
		this.mem_name = name;
		this.mem_email = email;
		this.mem_company = company;
		this.mem_isadmin = 0;
	}
	
	public int getMem_idnum() {
		return mem_idnum;
	}
	public void setMem_idnum(int mem_idnum) {
		this.mem_idnum = mem_idnum;
	}
	public String getMem_id() {
		return mem_id;
	}
	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}
	public String getMem_password() {
		return mem_password;
	}
	public void setMem_password(String mem_password) {
		this.mem_password = mem_password;
	}
	public String getMem_name() {
		return mem_name;
	}
	public void setMem_name(String mem_name) {
		this.mem_name = mem_name;
	}
	public String getMem_email() {
		return mem_email;
	}
	public void setMem_email(String mem_email) {
		this.mem_email = mem_email;
	}
	public String getMem_company() {
		return mem_company;
	}
	public void setMem_company(String mem_company) {
		this.mem_company = mem_company;
	}
	public int getMem_isadmin() {
		return mem_isadmin;
	}
	public void setMem_isadmin(int mem_isadmin) {
		this.mem_isadmin = mem_isadmin;
	}
	
	

}
