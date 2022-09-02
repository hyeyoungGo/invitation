package com.api.invitation.controller;

import com.api.invitation.model.Comments;
import com.api.invitation.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comment") // 댓글 관련
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("")
    public List<Comments> getAllComments() {
        return commentService.getAllComments();
    }

}
