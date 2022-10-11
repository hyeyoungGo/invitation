package com.api.invitation.model;

import lombok.Data;

@Data
public class Heart {
    private Integer heart_count;
    private String target;

    public Integer getHeart_count() {
        return heart_count;
    }

    public void setHeart_count(Integer heart_count) {
        this.heart_count = heart_count;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
