package com.kji.study.mybatis.generator.model;

import java.util.Date;

public class Email {
    private String requestId;

    private Long serviceId;

    private String title;

    private String requestIp;

    private String attachFileYn;

    private Date requestDate;

    private String groupYn;

    private String createUser;

    private Date createDate;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId == null ? null : requestId.trim();
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getRequestIp() {
        return requestIp;
    }

    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp == null ? null : requestIp.trim();
    }

    public String getAttachFileYn() {
        return attachFileYn;
    }

    public void setAttachFileYn(String attachFileYn) {
        this.attachFileYn = attachFileYn == null ? null : attachFileYn.trim();
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getGroupYn() {
        return groupYn;
    }

    public void setGroupYn(String groupYn) {
        this.groupYn = groupYn == null ? null : groupYn.trim();
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}