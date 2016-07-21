package com.zender.domain.resume;

import java.io.Serializable;

/**
 * 教育经历
 * */
@SuppressWarnings("serial")
public class Employment implements Serializable{
	private int id;
	private String companyName;
	private String startTime;
	private String endTime;
	private String site;
	private String siteDesc;
	private String workDesc;
	private String flag;
	private String sort;
	private String updateUser;
	private String updateTime;
	private int userId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getSiteDesc() {
		return siteDesc;
	}
	public void setSiteDesc(String siteDesc) {
		this.siteDesc = siteDesc;
	}
	public String getWorkDesc() {
		return workDesc;
	}
	public void setWorkDesc(String workDesc) {
		this.workDesc = workDesc;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return "Employment [id=" + id + ", companyName=" + companyName + ", startTime=" + startTime + ", endTime="
				+ endTime + ", site=" + site + ", siteDesc=" + siteDesc + ", workDesc=" + workDesc + ", flag=" + flag
				+ ", sort=" + sort + ", updateUser=" + updateUser + ", updateTime=" + updateTime + ", userId=" + userId
				+ "]";
	}
	
	
}
