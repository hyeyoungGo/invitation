package com.api.invitation.dao;

import com.api.invitation.model.Visitor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VisitorDAO {
    public Visitor getVisitorCount();

    public void upVisitor();

}
