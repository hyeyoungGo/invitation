package com.api.invitation.model;

import lombok.Data;

import java.util.Date;

@Data
public class Comments {
    private Integer comment_id;
    private String contents;
    private String writer;
    private String password;
    private String hidden_yn;
    private Date insert_dt;
    private String target;
}
