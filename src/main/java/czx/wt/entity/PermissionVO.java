package czx.wt.entity;

import java.io.Serializable;

public class PermissionVO implements Serializable{

	private static final long serialVersionUID = -2783081162690878303L;

	private String id;
	//菜单名称
	private String name;
	//父菜单id
	private String pId;
	//权限分类（0 菜单；1 功能）
	private String istype;
	//菜单编号
	private String code;
	//菜单url
	private String page;
	//菜单图标名称
	private String icon;
	//菜单排序
	private String zindex;

	private boolean checked;

	/*private boolean open;*/

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getIstype() {
		return istype;
	}

	public void setIstype(String istype) {
		this.istype = istype;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getZindex() {
		return zindex;
	}

	public void setZindex(String zindex) {
		this.zindex = zindex;
	}

	public boolean getChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public boolean getOpen() {
		return true;
	}

	/*public void setOpen(boolean open) {
		this.open = open;
	}*/
}