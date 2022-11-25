package com.MotorbikeStore.model;

import java.util.Date;

import com.opensymphony.module.sitemesh.html.Text;

public class commentModel {
	private int cmtId; 
	private int blogId; 
	private int parentId;
	private int userId; 
	private Date dateCmt; 
	private Text cmtDesc;
	public int getCmtId() {
		return cmtId;
	}
	public void setCmtId(int cmtId) {
		this.cmtId = cmtId;
	}
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getDateCmt() {
		return dateCmt;
	}
	public void setDateCmt(Date dateCmt) {
		this.dateCmt = dateCmt;
	}
	public Text getCmtDesc() {
		return cmtDesc;
	}
	public void setCmtDesc(Text cmtDesc) {
		this.cmtDesc = cmtDesc;
	}
	
	
}
