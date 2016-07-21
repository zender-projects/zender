package com.zender.domain.resume;

import java.io.Serializable;

/**
 * 职业技能
 * @author zender
 * */
@SuppressWarnings("serial")
public class Skill implements Serializable{
	
	private int id;
	private String stype;
	private String sdesc;
	private String flag;
	private int sort;
	private String udpateUser;
	private String updateTime;
	private String userId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStype() {
		return stype;
	}
	public void setStype(String stype) {
		this.stype = stype;
	}
	public String getSdesc() {
		return sdesc;
	}
	public void setSdesc(String sdesc) {
		this.sdesc = sdesc;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getUdpateUser() {
		return udpateUser;
	}
	public void setUdpateUser(String udpateUser) {
		this.udpateUser = udpateUser;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	@Override
	public String toString() {
		return "Skill [id=" + id + ", stype=" + stype + ", sdesc=" + sdesc + ", flag=" + flag + ", sort=" + sort
				+ ", udpateUser=" + udpateUser + ", updateTime=" + updateTime + ", userId=" + userId + "]";
	}
	
	
}
