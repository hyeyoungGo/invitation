package com.api.invitation.dao;

import com.api.invitation.model.Comments;
import com.api.invitation.model.Heart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HeartDAO {

    public List<Heart> getHeartCount();

    public void upHeart(String target);

}
