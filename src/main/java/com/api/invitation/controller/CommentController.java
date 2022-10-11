package com.api.invitation.controller;

import com.api.invitation.model.Comments;
import com.api.invitation.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value="/comment", method = {RequestMethod.POST}) // 댓글 관련
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("")
    public List<Comments> getAllComments() {
        return commentService.getAllComments();
    }

    @PostMapping(value="add")
    public ResponseEntity<Comments> Add(@RequestBody Comments comment) {

        Comments comments = commentService.add(comment);

        return new ResponseEntity<>(comments, HttpStatus.OK);
    }

    @PostMapping(value="delete")
    public HashMap<String, String> Delete(@RequestBody HashMap<String, String> parmaMap) {

        HashMap<String, String> resultsMap = commentService.delete(parmaMap);

        return resultsMap;
    }

}
