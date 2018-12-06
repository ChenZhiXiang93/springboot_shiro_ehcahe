package czx.wt.pojo;

import java.util.Date;

public class Role {
    private Integer id;
    //角色名称
    private String roleName;
    //角色描述
    private String descpt;
    //角色编号
    private String code;
    //操作用户id
    private Integer insertUid;
    //添加数据时间
    private Date insertTime;
    //更新时间
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getDescpt() {
        return descpt;
    }

    public void setDescpt(String descpt) {
        this.descpt = descpt == null ? null : descpt.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
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

    @Override public String toString() {
        return "Role{" + "id=" + id + ", roleName='" + roleName + '\''
                + ", descpt='" + descpt + '\'' + ", code='" + code + '\''
                + ", insertUid=" + insertUid + ", insertTime=" + insertTime
                + ", updateTime=" + updateTime + '}';
    }
}