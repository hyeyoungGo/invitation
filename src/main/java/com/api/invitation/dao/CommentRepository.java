package com.api.invitation.dao;

import com.api.invitation.model.Comments;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CommentRepository {

    public static List<Comments> comments;

    static{
        comments = new ArrayList<>();
        comments.add(new Comments(1, "안녕", "이동찬"));
        comments.add(new Comments(2, "반가워", "고혜영"));
    }

    public List<Comments> getAllComments(){
        return this.comments;
    }

}
