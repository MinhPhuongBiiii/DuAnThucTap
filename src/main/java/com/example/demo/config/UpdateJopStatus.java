package com.example.demo.config;

import com.example.demo.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class UpdateJopStatus {

    @Autowired
    private PromotionService service;

    @Scheduled(fixedRate = 60000) //10p
    public void schedulePromotionProgramUpdate() {
        System.out.println("đã update");
        service.jobUpdate();
    }
}
