package com.example.notificationservicemock.controller;


import com.example.notificationservicemock.models.Notifications;
import com.example.notificationservicemock.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    NotificationRepository notificationRepository;
    @PostMapping("/api/send/notification")
    public Notifications postNotification(@RequestBody Notifications notifications){
        System.out.println("i am hit");
        return notificationRepository.save(notifications);

    }
    @GetMapping("/api/receive/notification")
    public List<Notifications> getNotifications(){

        return notificationRepository.findAll();

    }




}
