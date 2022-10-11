package com.api.invitation.controller;

import com.api.invitation.model.Visitor;
import com.api.invitation.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping(value="/visitor", method = {RequestMethod.POST}) // 방문자
public class VisitorController {

    @Autowired
    private VisitorService visitorService;

    @PostMapping("")
    public Visitor getVisitorCount() {
        return visitorService.getVisitorCount();
    }

}
