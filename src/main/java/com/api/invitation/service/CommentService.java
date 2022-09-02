package com.api.invitation.service;

import com.api.invitation.dao.CommentRepository;
import com.api.invitation.model.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comments> getAllComments() {
        return commentRepository.getAllComments();
    }

}
