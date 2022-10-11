package com.api.invitation.service;

import com.api.invitation.dao.VisitorDAO;
import com.api.invitation.model.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VisitorService {

    @Autowired
    private VisitorDAO visitorDAO;

    public Visitor getVisitorCount() {
        try{
            visitorDAO.upVisitor();
        }catch (Exception e){
        }

        Visitor visitor = visitorDAO.getVisitorCount();
        System.out.println(visitor);

        return visitor;
    }

}
