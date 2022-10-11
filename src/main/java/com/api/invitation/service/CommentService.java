package com.api.invitation.service;

import com.api.invitation.dao.CommentsDAO;
import com.api.invitation.model.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentsDAO commentsDAO;

    public List<Comments> getAllComments() {
        List<Comments> listComments = commentsDAO.listComments();
        System.out.println(listComments);
        return listComments;
    }

    public Comments add(Comments comment) {
        commentsDAO.add(comment);
        return comment;
    }

    public HashMap<String, String> delete(HashMap<String, String> parmaMap) {
        HashMap<String, String> resultsMap = new HashMap<>();

        try{
            System.out.println(parmaMap);
            commentsDAO.delete(parmaMap);

            resultsMap.put("results", "Success");
            resultsMap.put("reason", "");
        }catch (Exception e){
            System.out.println(e.getMessage());
            resultsMap.put("results", "fail");
            resultsMap.put("reason", "패스워드 확인 필요");

            return resultsMap;
        }

        return resultsMap;
    }

}
