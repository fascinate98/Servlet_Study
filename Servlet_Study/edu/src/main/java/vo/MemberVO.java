package vo;

public class MemberVO {
	
	private String memName;
	private String memPhone;
	private String memId;
	private String memPw;
	
	
	public MemberVO (String memName, String memPhone, String memId,  String memPw) {
		this.memName = memName;
		this.memPhone = memPhone;
		this.memId = memId;
		this.memPw = memPw;
	}
	
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemPhone() {
		return memPhone;
	}
	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPw() {
		return memPw;
	}
	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}
	
	
}
