package com.api.invitation.model;

import lombok.Data;

import java.util.Date;

@Data
public class Visitor {
    private String visit_date;
    private int visit_count;
    private int total_count;
}
