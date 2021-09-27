package com.example.pranay.api;

public class UserClientRequest {
    private Long uid;
    private String userName;
    private Long aid;

    public UserClientRequest() {
    }

    public UserClientRequest(Long uid, String userName, Long aid) {
        this.uid = uid;
        this.userName = userName;
        this.aid = aid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }
}
