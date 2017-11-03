package com.kji.study.time.format;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IaasAuditBean {

	private String project;
	@JsonProperty("resource_id")
	private String resourceId;
	private String action;
	@JsonProperty("user_name")
	private String userName;
	@JsonProperty("user_id")
	private String userId;
	private String description;
	private Date timestamp;
	
	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

}
