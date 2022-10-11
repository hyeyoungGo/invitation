package com.api.invitation.service;

import com.api.invitation.dao.HeartDAO;
import com.api.invitation.model.Heart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class HeartService {

    @Autowired
    private HeartDAO heartDAO;

    public HashMap<String, Integer> getHeartCount() {
        List<Heart> listCount = heartDAO.getHeartCount();

        HashMap<String, Integer> resultsMap = new HashMap<>();

        resultsMap.put(listCount.get(0).getTarget(), listCount.get(0).getHeart_count());
        resultsMap.put(listCount.get(1).getTarget(), listCount.get(1).getHeart_count());


        return resultsMap;
    }

    public void upHeart(String target) {
        heartDAO.upHeart(target);
    }
}
