package com.api.invitation.model;

public class Comments {
    private Integer commNo;
    private String comm;
    private String username;

    public Comments(Integer commNo, String comm, String username) {
        this.commNo = commNo;
        this.comm = comm;
        this.username = username;
    }

    public Integer getCommNo() {
        return commNo;
    }

    public void setCommNo(Integer commNo) {
        this.commNo = commNo;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
