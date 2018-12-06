package czx.wt.pojo;

import java.util.Date;

public class Permission {
    private Integer id;
    //菜单名称
    private String name;
    //父菜单id
    private Integer pid;
    //菜单排序
    private Integer zindex;
    //权限分类（0 菜单；1 功能）
    private Integer istype;
    //描述
    private String descpt;
    //菜单编号
    private String code;
    //菜单图标名称
    private String icon;
    //菜单url
    private String page;
    //添加时间
    private Date insertTime;
    //更新时间
    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getZindex() {
        return zindex;
    }

    public void setZindex(Integer zindex) {
        this.zindex = zindex;
    }

    public Integer getIstype() {
        return istype;
    }

    public void setIstype(Integer istype) {
        this.istype = istype;
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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page == null ? null : page.trim();
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
        return "Permission{" + "id=" + id + ", name='" + name + '\'' + ", pid="
                + pid + ", zindex=" + zindex + ", istype=" + istype
                + ", descpt='" + descpt + '\'' + ", code='" + code + '\''
                + ", icon='" + icon + '\'' + ", page='" + page + '\''
                + ", insertTime=" + insertTime + ", updateTime=" + updateTime
                + '}';
    }
}