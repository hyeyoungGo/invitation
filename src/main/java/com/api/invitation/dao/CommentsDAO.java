package com.api.invitation.dao;

import com.api.invitation.model.Comments;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface CommentsDAO {

    public List<Comments> listComments();

    public void add(Comments paramMap);

    public void delete(HashMap<String, String> parmaMap);

}
