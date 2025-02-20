package p0220;

public class UserInfoVO {
	private int uiNum;
	private String uiName;
	private String uiId;
	private int uiPwd;
	public int getUiNum() {
		return uiNum;
	}
	public void setUiNum(int uiNum) {
		this.uiNum = uiNum;
	}
	public String getUiName() {
		return uiName;
	}
	public void setUiName(String uiName) {
		this.uiName = uiName;
	}
	public String getUiId() {
		return uiId;
	}
	public void setUiId(String uiId) {
		this.uiId = uiId;
	}
	public int getUiPwd() {
		return uiPwd;
	}
	public void setUiPwd(int uiPwd) {
		this.uiPwd = uiPwd;
	}
	@Override
	public String toString() {
		return "UserInfoVO [uiNum=" + uiNum + ", uiName=" + uiName + ", uiId=" + uiId + ", uiPwd=" + uiPwd + "]";
	}
	
	
	
}
