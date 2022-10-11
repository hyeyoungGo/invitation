package com.api.invitation.controller;

import com.api.invitation.model.Heart;
import com.api.invitation.service.HeartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping(value="/heart", method = {RequestMethod.POST}) // 좋아요
public class HeartController {

    @Autowired
    private HeartService heartService;

    @PostMapping("")
    public HashMap<String, Integer> getHeartCount() {
        return heartService.getHeartCount();
    }

    @PostMapping(value="up")
    public void upHeart(@RequestBody HashMap<String, String> parmaMap) {
        String target = parmaMap.get("target");
        heartService.upHeart(target);
    }
}
