package com.example.kafkademo.service;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics= "gaurav_Topic1", groupId = "gaurav_Group1")
    public void listenToTopic(String recievedMessage){
        System.out.println(recievedMessage);
    }
}
