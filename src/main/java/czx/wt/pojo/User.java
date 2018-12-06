package czx.wt.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private static final long serialVersionUID = -3096736268081409238L;

	private Integer id;
	//用户名
	private String username;
	//手机号
	private String mobile;
	//邮箱
	private String email;
	//密码
	private String password;
	//添加该用户的用户id
	private Integer insertUid;
	//注册时间
	private Date insertTime;
	//修改时间
	private Date updateTime;
	//是否删除（0：正常；1：已删）
	private Boolean isDel;
	//是否在职（0：正常；1，离职）
	private Boolean isJob;
	//短信验证码
	private String mcode;
	//短信发送时间
	private Date sendTime;
	//更新版本
	private Integer version;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile == null ? null : mobile.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public Integer getInsertUid() {
		return insertUid;
	}

	public void setInsertUid(Integer insertUid) {
		this.insertUid = insertUid;
	}

	public Date getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Boolean getIsDel() {
		return isDel;
	}

	public void setIsDel(Boolean isDel) {
		this.isDel = isDel;
	}

	public Boolean getIsJob() {
		return isJob;
	}

	public void setIsJob(Boolean isJob) {
		this.isJob = isJob;
	}

	public String getMcode() {
		return mcode;
	}

	public void setMcode(String mcode) {
		this.mcode = mcode;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", mobile="
				+ mobile + ", email=" + email + ", password=" + password
				+ ", insertUid=" + insertUid + ", insertTime=" + insertTime
				+ ", updateTime=" + updateTime + ", isDel=" + isDel
				+ ", isJob=" + isJob + ", mcode=" + mcode + ", sendTime="
				+ sendTime + ", version=" + version + "]";
	}

}